package aiss.dailymotionminer.service;

import aiss.dailymotionminer.model.ChannelDTO;
import aiss.dailymotionminer.model.ChannelUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChannelService {

    @Autowired
    RestTemplate restTemplate;

    private static final String BASE_URI = "https://api.dailymotion.com/user";

    public ChannelDTO findChannelById(String id){
        ChannelUser channelUser=restTemplate.getForObject(BASE_URI+"/"+id+"?fields=id,screenname,description,created_time,username,url,avatar_720_url", ChannelUser.class);
        if (channelUser==null){
            return null;//excepcion
        }
        ChannelDTO channel=new ChannelDTO();
        channel.setId(id);
        channel.setName(channelUser.getScreenname());
        channel.setDescription(channelUser.getDescription());
        channel.setCreatedTime(channelUser.getCreatedTime());
        return channel;
    }
}
