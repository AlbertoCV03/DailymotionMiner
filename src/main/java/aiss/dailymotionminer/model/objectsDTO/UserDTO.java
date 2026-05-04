
package aiss.dailymotionminer.model.objectsDTO;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;

@JsonPropertyOrder({
    "id",
    "name",
    "user_link",
    "picture_link"
})
@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("user_link")
    private String user_link;
    @JsonProperty("picture_link")
    private String picture_link;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("user_link")
    public String getUser_link() {
        return user_link;
    }

    @JsonProperty("user_link")
    public void setUser_link(String user_link) {
        this.user_link = user_link;
    }

    @JsonProperty("picture_link")
    public String getPicture_link() {
        return picture_link;
    }

    @JsonProperty("picture_link")
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
