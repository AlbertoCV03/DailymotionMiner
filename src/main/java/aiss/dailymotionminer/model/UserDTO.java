
package aiss.dailymotionminer.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "username",
    "url",
    "avatar_720_url"
})
@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {

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
    public String getName() {
        return name;
    }

    @JsonProperty("username")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("url")
    public String getUser_link() {
        return user_link;
    }

    @JsonProperty("url")
    public void setUser_link(String user_link) {
        this.user_link = user_link;
    }

    @JsonProperty("avatar_720_url")
    public String getPicture_link() {
        return picture_link;
    }

    @JsonProperty("avatar_720_url")
    public void setPicture_link(String picture_link) {
        this.picture_link = picture_link;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", user_link='" + user_link + '\'' +
                ", picture_link='" + picture_link + '\'' +
                '}';
    }
}
