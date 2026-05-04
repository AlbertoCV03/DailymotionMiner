package aiss.dailymotionminer.service;

import aiss.dailymotionminer.model.objectsDTO.ChannelDTO;
import aiss.dailymotionminer.model.ChannelUser;
import aiss.dailymotionminer.model.objectsDTO.VideoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ChannelService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    VideoService videoService;

    private static final String BASE_URI = "https://api.dailymotion.com/user";

    public ChannelDTO findChannelById(String id, int maxVideos, int maxComments){
        ChannelUser channelUser=restTemplate.getForObject(BASE_URI+"/"+id+"?fields=id,screenname,description,created_time,username,url,avatar_720_url", ChannelUser.class);
        if (channelUser==null){
            return null;
        }
        List<VideoDTO> videos=videoService.findAllVideosOfAChannelById(id, maxVideos, maxComments);
        ChannelDTO channel=new ChannelDTO();
        channel.setId(id);
        channel.setName(channelUser.getScreenname());
        channel.setDescription(channelUser.getDescription());
        channel.setCreatedTime(channelUser.getCreatedTime());
        channel.setVideos(videos);
        return channel;
    }

    public ChannelDTO postChannelDTOById(String id, int maxVideos, int maxComments){
        ChannelDTO channelDTO=findChannelById(id, maxVideos, maxComments);
        restTemplate.postForObject("http://localhost:8080/videominer/channels", channelDTO, ChannelDTO.class);
        return channelDTO;
    }
}
