
package aiss.dailymotionminer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "title",
    "description",
    "created_time",
        "subtitles",
        "tags",
        "owner"
})
@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class VideoDTO {

    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("created_time")
    private Integer releaseTime;
    @JsonProperty("subtitles")
    private List<CaptionProperties> captionProperties;
    @JsonProperty("tags")
    private List<CommentDTO> comment;
    @JsonProperty("owner")
    private String ownerId;

    private UserDTO user;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getName() {
        return name;
    }

    @JsonProperty("title")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("created_time")
    public Integer getReleaseTime() {
        return releaseTime;
    }

    @JsonProperty("created_time")
    public void setReleaseTime(Integer releaseTime) {
        this.releaseTime = releaseTime;
    }

    @JsonProperty("subtitles")
    public List<CaptionProperties> getCaptionProperties() {
        return captionProperties;
    }

    @JsonProperty("subtitles")
    public void setCaptionProperties(List<CaptionProperties> captionProperties) {
        this.captionProperties = captionProperties;
    }

    @JsonProperty("tags")
    public List<CommentDTO> getComment() {
        return comment;
    }

   @JsonProperty("tags")
    public void setComment(List<CommentDTO> comment) {
        this.comment = comment;
    }

    @JsonProperty("owner")
    public String getOwnerId() {
        return ownerId;
    }

    @JsonProperty("owner")
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "VideoDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", releaseTime=" + releaseTime +
                ", captionProperties=" + captionProperties +
                ", comment=" + comment +
                ", user=" + user +
                '}';
    }
}
