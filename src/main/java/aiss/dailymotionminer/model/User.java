
package aiss.dailymotionminer.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "username",
    "url",
    "avatar_720_url"
})
@Generated("jsonschema2pojo")
public class User {

    @JsonProperty("id")
    private String id;
    @JsonProperty("username")
    private String name;
    @JsonProperty("url")
    private String user_link;
    @JsonProperty("avatar_720_url")
    private String picture_link;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("username")
    public String getUsername() {
        return name;
    }

    @JsonProperty("username")
    public void setUsername(String name) {
        this.name = name;
    }

    @JsonProperty("url")
    public String getUrl() {
        return user_link;
    }

    @JsonProperty("url")
    public void setUrl(String user_link) {
        this.user_link = user_link;
    }

    @JsonProperty("avatar_720_url")
    public String getAvatar720Url() {
        return picture_link;
    }

    @JsonProperty("avatar_720_url")
    public void setAvatar720Url(String picture_link) {
        this.picture_link = picture_link;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(User.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.user_link == null)?"<null>":this.user_link));
        sb.append(',');
        sb.append("avatar720Url");
        sb.append('=');
        sb.append(((this.picture_link == null)?"<null>":this.picture_link));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
