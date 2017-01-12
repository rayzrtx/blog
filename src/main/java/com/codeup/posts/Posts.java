package com.codeup.posts;

import com.codeup.posts.Post;

import java.util.List;

/**
 * Created by raylinares on 1/5/17.
 */
public interface Posts {
    List<Post> allPosts();  //returns a list of posts
    void savePost(Post post);   //

    Post findPost(long id);

    void updatePost(Post post);
    void deletePost(Post post);

}


