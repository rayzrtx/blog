package com.codeup;

import java.util.List;

/**
 * Created by raylinares on 1/5/17.
 */
public interface Posts {
    List<Post> allPosts();  //returns a list of posts
    void savePost(Post post);   //
}


