package com.codeup;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.soap.Text;

/**
 * Created by raylinares on 1/5/17.
 */
@Entity
@Table(name = "posts")
public class Post {     // list variables needed and create all getters and setters for each variable for new object
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Title can't be empty.")                        // Alert if title is blank
    @Size(min = 2, message = "A title must be at least 2 characters.") //Alert if title is not at least 2 characters long
    @Column(nullable = false)
    private String title;

    @NotBlank(message = "Body can't be empty.")     //Alert if body is empty
    @Column(nullable = false, length = 65000)
    private String body;

    public Post(long id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }
    public Post(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
