package com.codeup;

import javax.persistence.*;
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

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
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
