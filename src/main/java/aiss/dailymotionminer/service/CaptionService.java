package aiss.dailymotionminer.service;

import aiss.dailymotionminer.model.Caption;
import aiss.dailymotionminer.model.CaptionProperties;
import aiss.dailymotionminer.model.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.awt.geom.RectangularShape;
import java.util.List;

@Service
public class CaptionService {

    @Autowired
    RestTemplate restTemplate;

    private static final String BASE_URI = "https://api.dailymotion.com/video";

    public List<CaptionProperties> getCaptionByVideoId(Video video){
        Caption caption=restTemplate.getForObject(BASE_URI+"/"+video.getId()+"/subtitles?fields=id,url,language", Caption.class);
        if (caption == null || caption.getCaptionProperties() == null) {
            return List.of();
        }
        return caption.getCaptionProperties();
    }
}
