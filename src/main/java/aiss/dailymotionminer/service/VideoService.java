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

    public List<VideoDTO> findAllVideosOfAChannelById(String userId, int maxVideos, int maxPages) {
        List<VideoDTO> res=new ArrayList<>();
        int page=1;
        int maxPerPage=100;
        while (page<=maxPages && res.size()<maxVideos){
            int limit=Math.min(maxVideos-res.size(), maxPerPage);
            VideosResponse videos=restTemplate.getForObject(BASE_URI+"/user/"+userId+"/videos?limit="+limit+"&page="+page, VideosResponse.class);
            if (videos==null || videos.getList()==null){
                break;
            }
            List<VideoDTO> allVideos=videos.getList();
            if (allVideos.isEmpty()){
                break;
            }
            for (VideoDTO video: allVideos){
                if (res.size() >= maxVideos) {
                    break;
                }
                String id= video.getId();
                VideoDTO dto=findVideoById(id);
                if (dto != null){
                    res.add(dto);
                }
            }
            page++;
        }
        return res;

//        VideosResponse videos=restTemplate.getForObject(BASE_URI+"/user/"+userId+"/videos?limit="+maxVideos+"&page="+maxPages, VideosResponse.class);
//        if (videos==null){
//            return List.of();
//        }
//        List<VideoDTO> allVideos=videos.getList();
//        List<VideoDTO> res=new ArrayList<>();
//        for (int i=0; i<allVideos.size(); i++){
//            String id=allVideos.get(i).getId();
//            VideoDTO dto=findVideoById(id);
//            if (dto != null){
//                res.add(dto);
//            }
//        }
//        return res;
    }

    public VideoDTO findVideoById(String id){
        Video video=restTemplate.getForObject(BASE_URI+"/video/"+id+"?fields=id,title,description,created_time,tags,owner", Video.class);
        if (video==null){
            return null;
        }
        VideoDTO dto=new VideoDTO();
        UserDTO user=userService.findUserById(video.getOwnerId());
        List<CaptionPropertiesDTO> captionProperties=captionService.findCaptionByVideoId(id);
        List<CommentDTO> comments=commentService.findComments(id);
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
