package aiss.dailymotionminer.service;

import aiss.dailymotionminer.model.Comment;
import aiss.dailymotionminer.model.CommentDTO;
import aiss.dailymotionminer.model.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CommentService {

    @Autowired
    RestTemplate restTemplate;

    private static final String BASE_URI = "https://api.dailymotion.com/video";

    public List<CommentDTO> findComments(String videoId){
        Video video=restTemplate.getForObject(BASE_URI+"/"+videoId+"?fields=tags,created_time", Video.class);
        List<CommentDTO> res=new ArrayList<>();
        if (video != null && video.getComment() != null && !video.getComment().isEmpty()){
            for (String comm: video.getComment()) {
                CommentDTO commentDTO=new CommentDTO();
                commentDTO.setId(UUID.randomUUID().toString());
                commentDTO.setText(comm);
                commentDTO.setReleaseTime(video.getReleaseTime());
                res.add(commentDTO);
            }
            return res;
        } else {
            return List.of();//excepcion
        }
    }
}
