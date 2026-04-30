package aiss.dailymotionminer.controller;

import aiss.dailymotionminer.model.ChannelDTO;
import aiss.dailymotionminer.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dailymotion")
public class ChannelController {
    @Autowired
    ChannelService channelService;

    @PostMapping("/{id}")
    public ChannelDTO postChannel(@PathVariable String id) { return channelService.findChannelById(id); }
}
