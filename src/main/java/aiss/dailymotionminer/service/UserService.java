package aiss.dailymotionminer.service;

import aiss.dailymotionminer.model.ChannelUser;
import aiss.dailymotionminer.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    RestTemplate restTemplate;

    private static final String BASE_URI = "https://api.dailymotion.com/video";

    public UserDTO findUserById(String id){
        ChannelUser channelUser=restTemplate.getForObject(BASE_URI+"/"+id, ChannelUser.class);
        if (channelUser==null){
            return null;//excepcion
        }
        UserDTO user=new UserDTO();
        user.setId(id);
        user.setName(channelUser.getUsername());
        user.setUser_link(channelUser.getUrl());
        user.setPicture_link(channelUser.getAvatar720Url());
        return user;
    }
}
