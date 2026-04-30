
package aiss.dailymotionminer.model;

import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tags"
})
@Generated("jsonschema2pojo")
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
