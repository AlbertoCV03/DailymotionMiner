
package aiss.dailymotionminer.model.objectsDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
        "text",
        "createdOn"
})
@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommentDTO {

    @JsonProperty("id")
    private String id;
    @JsonProperty("text")
    private String text;
    @JsonProperty("createdOn")
    private String releaseTime;


    @JsonProperty("id")
    public String getId() {
        return id ;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("createdOn")
    public String getReleaseTime() {
        return releaseTime;
    }

    @JsonProperty("createdOn")
    public void setReleaseTime(String releaseTime) {
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
