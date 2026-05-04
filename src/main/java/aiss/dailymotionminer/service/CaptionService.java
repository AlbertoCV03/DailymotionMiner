package aiss.dailymotionminer.service;

import aiss.dailymotionminer.model.Caption;
import aiss.dailymotionminer.model.CaptionProperties;
import aiss.dailymotionminer.model.CaptionPropertiesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CaptionService {

    @Autowired
    RestTemplate restTemplate;

    private static final String BASE_URI = "https://api.dailymotion.com/video";

    public List<CaptionPropertiesDTO> findCaptionByVideoId(String videoId){
        Caption caption=restTemplate.getForObject(BASE_URI+"/"+videoId+"/subtitles?fields=id,url,language", Caption.class);
        if (caption == null || caption.getCaptionProperties() == null) {
            return List.of();
        }
        List<CaptionPropertiesDTO> res=new ArrayList<>();
        for (CaptionProperties cp: caption.getCaptionProperties()){
            CaptionPropertiesDTO captionPropertiesDTO=new CaptionPropertiesDTO();
            captionPropertiesDTO.setId(cp.getId());
            captionPropertiesDTO.setLink(cp.getLink());
            captionPropertiesDTO.setLanguage(cp.getLanguage());
            res.add(captionPropertiesDTO);
        }
        return res;
    }
}
