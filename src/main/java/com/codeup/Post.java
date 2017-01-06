package com.codeup;

import javax.xml.soap.Text;

/**
 * Created by raylinares on 1/5/17.
 */
public class Post {     // list variables needed and create all getters and setters for each variable for new object
    private long id;
    private String title;

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

    private String body;
}
