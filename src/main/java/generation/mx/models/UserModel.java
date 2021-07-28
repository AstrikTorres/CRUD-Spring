package generation.mx.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;

    @Column(nullable = false, length = 100, name = "name")
    private String name;

    @Column(nullable = false, length = 100)
    private String surname;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    @OneToMany( targetEntity = PostModel.class)
    private List<PostModel> posts;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List getPosts() {
        return posts;
    }

    public void setPosts(List posts) {
        this.posts = posts;
    }
}
