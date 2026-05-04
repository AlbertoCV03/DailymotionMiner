
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
    "name",
    "description",
    "releaseTime",
        "captions",
        "comments",
        "userId",
        "user"
})
@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class VideoDTO {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("releaseTime")
    private Integer releaseTime;
    @JsonProperty("caption")
    private List<CaptionPropertiesDTO> captionProperties;
    @JsonProperty("comments")
    private List<CommentDTO> comment;
    @JsonProperty("user")
    private UserDTO user;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
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

    @JsonProperty("releaseTime")
    public Integer getReleaseTime() {
        return releaseTime;
    }

    @JsonProperty("releaseTime")
    public void setReleaseTime(Integer releaseTime) {
        this.releaseTime = releaseTime;
    }

    @JsonProperty("caption")
    public List<CaptionPropertiesDTO> getCaptionProperties() {
        return captionProperties;
    }

    @JsonProperty("caption")
    public void setCaptionProperties(List<CaptionPropertiesDTO> captionProperties) {
        this.captionProperties = captionProperties;
    }

    @JsonProperty("comments")
    public List<CommentDTO> getComment() {
        return comment;
    }

   @JsonProperty("comments")
    public void setComment(List<CommentDTO> comment) {
        this.comment = comment;
    }

    @JsonProperty("user")
    public UserDTO getUser() {
        return user;
    }

    @JsonProperty("user")
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
