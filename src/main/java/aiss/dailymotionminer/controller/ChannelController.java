package aiss.dailymotionminer.controller;

import aiss.dailymotionminer.model.ChannelDTO;
import aiss.dailymotionminer.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dailymotion")
public class ChannelController {
    @Autowired
    ChannelService channelService;

    @GetMapping("/{id}")
    public ChannelDTO getChannel(@PathVariable String id, @RequestParam (required = false, defaultValue = "10") int maxVideos, @RequestParam (required = false, defaultValue = "2") int maxComments) { return channelService.findChannelById(id, maxVideos, maxComments); }

    @PostMapping("/{id}")
    public ChannelDTO postChannel(@PathVariable String id, @RequestParam (required = false, defaultValue = "10") int maxVideos, @RequestParam (required = false, defaultValue = "2") int maxComments) { return channelService.findChannelById(id, maxVideos, maxComments); }
}
