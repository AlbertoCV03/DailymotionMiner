package aiss.dailymotionminer.controller;

import aiss.dailymotionminer.model.ChannelDTO;
import aiss.dailymotionminer.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/dailymotion/v1")
public class ChannelController {
    @Autowired
    ChannelService channelService;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ChannelDTO getChannel(@PathVariable String id, @RequestParam (required = false, defaultValue = "10") int maxVideos, @RequestParam (required = false, defaultValue = "2") int maxComments) { return channelService.findChannelById(id, maxVideos, maxComments); }

    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ChannelDTO postChannel(@PathVariable String id, @RequestParam (required = false, defaultValue = "10") int maxVideos, @RequestParam (required = false, defaultValue = "2") int maxComments) {
        ChannelDTO channelDTO=channelService.postChannelDTOById(id, maxVideos, maxComments);
        return channelDTO;
    }
}
