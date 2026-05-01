
package aiss.dailymotionminer.model;

import java.util.List;
import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tags"
})
@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Comment {

    @JsonProperty("tags")
    private List<String> text;

    @JsonProperty("tags")
    public List<String> getText() {
        return text;
    }

    @JsonProperty("tags")
    public void setText(List<String> text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "text=" + text +
                '}';
    }
}
