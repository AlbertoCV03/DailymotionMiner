package aiss.dailymotionminer.controller;

import aiss.dailymotionminer.model.objectsDTO.ChannelDTO;
import aiss.dailymotionminer.service.ChannelService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Channel", description = "Channel operations")
@RestController
@RequestMapping("/dailymotion/v1")
public class ChannelController {
    @Autowired
    ChannelService channelService;

    @Operation(
            summary = "Retrieve a channel by its channel id",
            description = "Get a channelDTO object by specifying its channel id")
    @GetMapping("/{id}")
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "List of channels",
                    content = { @Content(schema = @Schema(implementation = ChannelDTO.class),
                            mediaType = "application/json") }),
            @ApiResponse(
                    responseCode = "404",
                    description="Channel not found",
                    content = { @Content(schema = @Schema()) })})
    @ResponseStatus(HttpStatus.OK)
    public ChannelDTO getChannel(
            @Parameter(description = "Name of channel to be searched")@PathVariable String id,
            @Parameter(description = "Maximum number of videos to be searched")@RequestParam (required = false, defaultValue = "10") int maxVideos,
            @Parameter(description = "Maximum number of comments per video to be searched")@RequestParam (required = false, defaultValue = "2") int maxPages) {
        return channelService.findChannelById(id, maxVideos, maxPages);
    }

    @Operation(
            summary = "Save a channel by its channel id",
            description = "Post a channelDTO object to VideoMiner by specifying its channel id")
    @PostMapping("/{id}")
    @ApiResponses({
            @ApiResponse(
                    responseCode = "201",
                    description = "Channel successfully created",
                    content = { @Content(schema = @Schema(implementation = ChannelDTO.class),
                            mediaType = "application/json") }),
            @ApiResponse(
                    responseCode = "500",
                    description="The sent channel object  was incorrectly formed. Usually caused by a non existing channel name",
                    content = { @Content(schema = @Schema()) })})
    @ResponseStatus(HttpStatus.CREATED)
    public ChannelDTO postChannel(
            @Parameter(description = "Name of channel to be created")@PathVariable String id,
            @Parameter(description = "Maximum number of videos to be included")@RequestParam (required = false, defaultValue = "10") int maxVideos,
            @Parameter(description = "Maximum number of comments per video to be included")@RequestParam (required = false, defaultValue = "2") int maxPages) {
        ChannelDTO channelDTO=channelService.postChannelDTOById(id, maxVideos, maxPages);
        return channelDTO;
    }
}
