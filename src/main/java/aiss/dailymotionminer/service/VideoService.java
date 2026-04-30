package aiss.dailymotionminer.service;

import aiss.dailymotionminer.model.Video;
import aiss.dailymotionminer.model.VideosResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class VideoService {

    @Autowired
    RestTemplate restTemplate;

    private static final String BASE_URI = "https://api.dailymotion.com";

    public List<Video> getAllVideosOfAChannelById(String userId) {
        VideosResponse videos=restTemplate.getForObject(BASE_URI+"/user"+userId+"/videos", VideosResponse.class);
        if (videos==null){
            return null;//excepcion
        }
        return videos.getList();
    }

    public Video getVideoById(String id){
        Video video=restTemplate.getForObject(BASE_URI+"/video"+id+"?fields=id,title,description,created_time", Video.class);
        if (video==null){
            return null;//excepcion
        }
        return video;
    }
}
