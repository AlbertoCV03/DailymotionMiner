
package aiss.dailymotionminer.model;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "url",
    "language"
})
@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaptionProperties {

    @JsonProperty("id")
    private String id;
    @JsonProperty("url")
    private String link;
    @JsonProperty("language")
    private String language;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("url")
    public String getLink() {
        return link;
    }

    @JsonProperty("url")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "CaptionProperties{" +
                "id='" + id + '\'' +
                ", link='" + link + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
