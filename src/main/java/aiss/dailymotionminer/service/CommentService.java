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

    public List<CommentDTO> getComments(Video video){
        Comment comments=restTemplate.getForObject(BASE_URI+"/"+video.getId()+"?fields=tags", Comment.class);
        List<CommentDTO> res=new ArrayList<>();
        if (comments != null && comments.getText() != null){
            for (String comm: comments.getText()) {
                CommentDTO commentDTO=new CommentDTO();
                commentDTO.setId(UUID.randomUUID().toString());
                commentDTO.setText(comm);
                commentDTO.setReleaseTime(video.getReleaseTime());
                res.add(commentDTO);
            }
            return res;
        } else {
            return null;//excepcion
        }
    }
}
