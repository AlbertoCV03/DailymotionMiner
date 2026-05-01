package aiss.dailymotionminer.service;

import aiss.dailymotionminer.model.ChannelDTO;
import aiss.dailymotionminer.model.ChannelUser;
import aiss.dailymotionminer.model.VideoDTO;
import aiss.dailymotionminer.model.VideosResponse;
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

    public ChannelDTO findChannelById(String id){
        ChannelUser channelUser=restTemplate.getForObject(BASE_URI+"/"+id+"?fields=id,screenname,description,created_time,username,url,avatar_720_url", ChannelUser.class);
        if (channelUser==null){
            return null;//excepcion
        }
        List<VideoDTO> videos=videoService.findAllVideosOfAChannelById(id);
        ChannelDTO channel=new ChannelDTO();
        channel.setId(id);
        channel.setName(channelUser.getScreenname());
        channel.setDescription(channelUser.getDescription());
        channel.setCreatedTime(channelUser.getCreatedTime());
        channel.setVideos(videos);
        return channel;
    }
}
