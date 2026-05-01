
package aiss.dailymotionminer.model;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "list"
})
@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class VideosResponse {

    @JsonProperty("list")
    private List<VideoDTO> list;

    @JsonProperty("list")
    public List<VideoDTO> getList() {
        return list;
    }

    @JsonProperty("list")
    public void setList(List<VideoDTO> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "VideosResponse{" +
                "list=" + list +
                '}';
    }
}
