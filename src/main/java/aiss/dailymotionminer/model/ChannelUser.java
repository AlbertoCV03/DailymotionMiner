
package aiss.dailymotionminer.model;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "screenname",
    "description",
    "created_time",
    "username",
    "url",
    "avatar_720_url"
})
@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChannelUser {

    @JsonProperty("id")
    private String id;
    @JsonProperty("screenname")
    private String screenname;
    @JsonProperty("description")
    private String description;
    @JsonProperty("created_time")
    private Integer createdTime;
    @JsonProperty("username")
    private String username;
    @JsonProperty("url")
    private String url;
    @JsonProperty("avatar_720_url")
    private String avatar720Url;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("screenname")
    public String getScreenname() {
        return screenname;
    }

    @JsonProperty("screenname")
    public void setScreenname(String screenname) {
        this.screenname = screenname;
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
    public Integer getCreatedTime() {
        return createdTime;
    }

    @JsonProperty("created_time")
    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("avatar_720_url")
    public String getAvatar720Url() {
        return avatar720Url;
    }

    @JsonProperty("avatar_720_url")
    public void setAvatar720Url(String avatar720Url) {
        this.avatar720Url = avatar720Url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChannelUser.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("screenname");
        sb.append('=');
        sb.append(((this.screenname == null)?"<null>":this.screenname));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("createdTime");
        sb.append('=');
        sb.append(((this.createdTime == null)?"<null>":this.createdTime));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("avatar720Url");
        sb.append('=');
        sb.append(((this.avatar720Url == null)?"<null>":this.avatar720Url));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
