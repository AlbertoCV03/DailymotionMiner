
package aiss.dailymotionminer.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
        "tags",
        "created_time"
})
@Generated("jsonschema2pojo")
public class CommentDTO {

    @JsonProperty("id")
    private String id;
    @JsonProperty("tags")
    private String text;
    @JsonProperty("created_time")
    private Integer releaseTime;


    @JsonProperty("id")
    public String getId() {
        return id ;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("tags")
    public String getText() {
        return text;
    }

    @JsonProperty("tags")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("created_time")
    public Integer getReleaseTime() {
        return releaseTime;
    }

    @JsonProperty("created_time")
    public void setReleaseTime(Integer releaseTime) {
        this.releaseTime = releaseTime;
    }

    @Override
    public String toString() {
        return "TagDTO{" +
                "id='" + id + '\'' +
                ", text=" + text +
                ", releaseTime=" + releaseTime +
                '}';
    }
}
