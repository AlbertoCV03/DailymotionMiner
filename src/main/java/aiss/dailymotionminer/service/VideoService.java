package aiss.dailymotionminer.service;

import aiss.dailymotionminer.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    UserService userService;

    @Autowired
    CaptionService captionService;

    @Autowired
    CommentService commentService;

    private static final String BASE_URI = "https://api.dailymotion.com";

    public List<VideoDTO> findAllVideosOfAChannelById(String userId, int maxVideos, int maxComments) {
        VideosResponse videos=restTemplate.getForObject(BASE_URI+"/user/"+userId+"/videos", VideosResponse.class);
        if (videos==null){
            return List.of();
        }
        List<VideoDTO> allVideos=videos.getList();
        List<VideoDTO> res=new ArrayList<>();
        int limit=Math.min(maxVideos, allVideos.size());
        for (int i=0; i<limit; i++){
            String id=allVideos.get(i).getId();
            VideoDTO dto=findVideoById(id, maxComments);
            if (dto != null){
                res.add(dto);
            }
        }
        return res;
    }

    public VideoDTO findVideoById(String id, int maxComments){
        Video video=restTemplate.getForObject(BASE_URI+"/video/"+id+"?fields=id,title,description,created_time,tags,owner", Video.class);
        if (video==null){
            return null;
        }
        VideoDTO dto=new VideoDTO();
        UserDTO user=userService.findUserById(video.getOwnerId());
        List<CaptionPropertiesDTO> captionProperties=captionService.findCaptionByVideoId(id);
        List<CommentDTO> comments=commentService.findComments(id, maxComments);
        dto.setId(id);
        dto.setName(video.getName());
        dto.setDescription(video.getDescription());
        dto.setReleaseTime(video.getReleaseTime());
        dto.setCaptionProperties(captionProperties);
        dto.setComment(comments);
        dto.setUser(user);
        return dto;
    }

}
