import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
    String id;
    String text;
    String type;
    String user;
    Integer upvotes;

    public Post(@JsonProperty("id") String id,
                @JsonProperty("text") String text,
                @JsonProperty("type") String type,
                @JsonProperty("user") String user,
                @JsonProperty("upvotes") int upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "Post\n" +
                "\t id = " + id + "\n" +
                "\t text = " + text + "\n" +
                "\t type = " + type + "\n" +
                "\t user = " + user + "\n" +
                "\t upvotes = " + upvotes;
    }
}
