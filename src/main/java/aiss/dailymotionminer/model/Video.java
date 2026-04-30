
package aiss.dailymotionminer.model;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "title",
    "description",
    "created_time",
        "tags"
})
@Generated("jsonschema2pojo")
public class Video {

    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("created_time")
    private Integer releaseTime;
    @JsonProperty("tags")
    private Comment comment;

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

    @JsonProperty("tags")
    public Comment getComment() {
        return comment;
    }

   @JsonProperty("tags")
    public void setComment(Comment comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", releaseTime=" + releaseTime +
                ", comments=" + comment +
                '}';
    }
}
