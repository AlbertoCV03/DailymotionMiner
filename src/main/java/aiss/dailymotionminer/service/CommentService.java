package aiss.dailymotionminer.service;

import aiss.dailymotionminer.model.Comment;
import aiss.dailymotionminer.model.CommentDTO;
import aiss.dailymotionminer.model.Video;
import aiss.dailymotionminer.model.VideoDTO;
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

    @Autowired
    VideoService videoService;

    private static final String BASE_URI = "https://api.dailymotion.com/video";

    public List<CommentDTO> findComments(String videoId){
        Comment comments=restTemplate.getForObject(BASE_URI+"/"+videoId+"?fields=tags", Comment.class);
        List<CommentDTO> res=new ArrayList<>();
        if (comments != null && comments.getText() != null){
            for (String comm: comments.getText()) {
                CommentDTO commentDTO=new CommentDTO();
                commentDTO.setId(UUID.randomUUID().toString());
                commentDTO.setText(comm);
                commentDTO.setReleaseTime(videoService.findVideoById(videoId).getReleaseTime());
                res.add(commentDTO);
            }
            return res;
        } else {
            return null;//excepcion
        }
    }
}
