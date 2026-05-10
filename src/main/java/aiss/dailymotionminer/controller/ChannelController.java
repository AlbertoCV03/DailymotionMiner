package aiss.dailymotionminer.controller;

import aiss.dailymotionminer.model.objectsDTO.ChannelDTO;
import aiss.dailymotionminer.service.ChannelService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
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
    @Operation(
            summary = "Retrieve a channel by its channel id",
            description = "Get a channelDTO object by specifying its channel id")
    @GetMapping("/{id}")
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "List of channels",
                    content = { @Content(
                            schema = @Schema(implementation = ChannelDTO.class),
                            mediaType = "application/json",
                            examples =@ExampleObject(
                                    name = "Channel example",
                                    summary = "Successful response",
                                    description = "This example provides the representation of a valid response",
                                    value= """
                                            {
                                                "id": "x4yq48o",
                                                "name": "Pasion SD",
                                                "description": "",
                                                "createdTime": "2026-04-25T23:59:47Z",
                                                "videos": [
                                                    {
                                                        "id": "xa8nv0g",
                                                        "name": "Hidden Companionship | HD 1080p",
                                                        "description": "Hidden Companionship - Serie completa en español.<br />Hidden Companionship Short Drama ReelShort.<br /><br />☝️ Activa los subtítulos (icono CC en el reproductor)<br /><br />Mira todos los episodios gratis.<br /><br />#ShortDrama #DramaEspañol #DramaCorto #Romance #HiddenCompanionship #ReelShort",
                                                        "releaseTime": "2026-05-08T22:36:17Z",
                                                        "user": {
                                                            "id": null,
                                                            "name": "PasionSD",
                                                            "user_link": "https://www.dailymotion.com/PasionSD",
                                                            "picture_link": "https://s2.dmcdn.net/d/5000002HraHpp/720x720"
                                                        },
                                                        "comments": [
                                                            {
                                                                "id": "656d498a-4913-43ba-9fff-ed3cbc6d94c2",
                                                                "text": "hidden companionship",
                                                                "createdOn": "2026-05-08T22:36:17Z"
                                                            },
                                                            {
                                                                "id": "d25627e7-3f07-4715-99ae-edee495416b4",
                                                                "text": "drama español",
                                                                "createdOn": "2026-05-08T22:36:17Z"
                                                            },
                                                            {
                                                                "id": "f35f4eb7-e43f-4751-835f-aabaf77a204f",
                                                                "text": "drama corto",
                                                                "createdOn": "2026-05-08T22:36:17Z"
                                                            },
                                                            {
                                                                "id": "3cce0cb8-ae48-41b5-af93-a30dfc719b19",
                                                                "text": "romance",
                                                                "createdOn": "2026-05-08T22:36:17Z"
                                                            },
                                                            {
                                                                "id": "474cff3d-70ee-428e-9f73-2dc200a3afe4",
                                                                "text": "reelshort",
                                                                "createdOn": "2026-05-08T22:36:17Z"
                                                            },
                                                            {
                                                                "id": "0b2bdea8-e5fc-4872-a976-07cd5dc66678",
                                                                "text": "vertical",
                                                                "createdOn": "2026-05-08T22:36:17Z"
                                                            },
                                                            {
                                                                "id": "65ac7c8b-87e1-4835-add4-22505f00dd14",
                                                                "text": "drama latino",
                                                                "createdOn": "2026-05-08T22:36:17Z"
                                                            },
                                                            {
                                                                "id": "cf58213d-3b88-4875-80f6-06b7069928db",
                                                                "text": "historia de amor",
                                                                "createdOn": "2026-05-08T22:36:17Z"
                                                            },
                                                            {
                                                                "id": "317b476b-4562-4e97-a94e-f308c5963d3a",
                                                                "text": "serie dramática",
                                                                "createdOn": "2026-05-08T22:36:17Z"
                                                            },
                                                            {
                                                                "id": "6baeda2e-c2f2-41c7-9258-db11bad517c4",
                                                                "text": "formato vertical",
                                                                "createdOn": "2026-05-08T22:36:17Z"
                                                            },
                                                            {
                                                                "id": "7fef56e5-6ae3-49a4-afe2-b95f0030ca26",
                                                                "text": "romántico",
                                                                "createdOn": "2026-05-08T22:36:17Z"
                                                            },
                                                            {
                                                                "id": "41d8977d-94a1-4ce4-b7a3-699143f7f398",
                                                                "text": "intriga",
                                                                "createdOn": "2026-05-08T22:36:17Z"
                                                            },
                                                            {
                                                                "id": "dc9b51e4-fe6f-47e5-ac77-52e68bdab17c",
                                                                "text": "multimillonario",
                                                                "createdOn": "2026-05-08T22:36:17Z"
                                                            },
                                                            {
                                                                "id": "bffdfbc7-5b14-4ddb-9283-79bb51aad73d",
                                                                "text": "short drama",
                                                                "createdOn": "2026-05-08T22:36:17Z"
                                                            },
                                                            {
                                                                "id": "ef9eb90a-59a8-4f69-8c17-5b34087f8acf",
                                                                "text": "película completa",
                                                                "createdOn": "2026-05-08T22:36:17Z"
                                                            },
                                                            {
                                                                "id": "aeb16de1-ab14-4a7e-8cd0-017a700b3fef",
                                                                "text": "subtítulos español",
                                                                "createdOn": "2026-05-08T22:36:17Z"
                                                            },
                                                            {
                                                                "id": "02061e0f-e1ca-4776-a3a2-0a6b4cf5a4af",
                                                                "text": "reelshort español",
                                                                "createdOn": "2026-05-08T22:36:17Z"
                                                            },
                                                            {
                                                                "id": "70a868b1-cea0-4e20-ae4a-9b2ae6097631",
                                                                "text": "emoción",
                                                                "createdOn": "2026-05-08T22:36:17Z"
                                                            },
                                                            {
                                                                "id": "f5100828-7d68-49aa-9bb2-f40c2419b53d",
                                                                "text": "drama romántico",
                                                                "createdOn": "2026-05-08T22:36:17Z"
                                                            },
                                                            {
                                                                "id": "6579265f-7a90-417b-964a-3074019d6bba",
                                                                "text": "serie completa",
                                                                "createdOn": "2026-05-08T22:36:17Z"
                                                            }
                                                        ],
                                                        "captions": [
                                                            {
                                                                "id": "xa8nv0g.es",
                                                                "link": "https://static2.dmcdn.net/sec2(Tb1qynWMbpKlRfde8qUF5NO-ycB_t6LQCX85cXGvNSDH0nv6tt89Rn2vgWhTJ92HDDlmvijAYxkivsUAwAlGhPWt80UtJ52ez1Jm8MFWtdcnWfTziXWr1qwAvOBs5qjAUcnMzwXbjzQgDwZMT_cyJaBSMH546fv7UIvg-hRWRdJfnDjCEvR-pOqUtnRnlsJB-qsOJZcKh3wPJWfgixEX3TmguPVGMrHN6-MiIrHNopUs9uafWORLjALwHf_cFC3ozpqpDw13kYcgmzlIAHMVNQ)/static/video/869/112/619211968_subtitle_es.srt",
                                                                "language": "es"
                                                            }
                                                        ]
                                                    }
                                                ]
                                            }
                                            """
                            ))}),
            @ApiResponse(
                    responseCode = "404",
                    description="❌ **Channel not found**",
                    content = { @Content(schema = @Schema()) })})
    @ResponseStatus(HttpStatus.OK)
    public ChannelDTO getChannel(
            @Parameter(description = "Name of channel to be searched", example = "PasionSD")@PathVariable String id,
            @Parameter(description = "Maximum number of videos to be searched", example = "1")@RequestParam (required = false, defaultValue = "10") int maxVideos,
            @Parameter(description = "Maximum number of pages per request to be searched")@RequestParam (required = false, defaultValue = "2") int maxPages) {
        return channelService.findChannelById(id, maxVideos, maxPages);
    }

    @Autowired
    ChannelService channelService;

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
            @Parameter(description = "Maximum number of pages per request to be included")@RequestParam (required = false, defaultValue = "2") int maxPages) {
        ChannelDTO channelDTO=channelService.postChannelDTOById(id, maxVideos, maxPages);
        return channelDTO;
    }
}
