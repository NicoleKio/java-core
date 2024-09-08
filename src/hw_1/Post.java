package hw_1;

public class Post {
    private int post_id;
    private int id;
    private String name;
    private String email;
    private String body;

    public Post() {}

    public Post(int post_id, int id, String name, String email, String body) {
        this.post_id = post_id;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    public int getPost_id() {
        return post_id;
    }
    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "post_id=" + post_id +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
