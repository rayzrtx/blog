package com.codeup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by raylinares on 1/5/17.
 */
public class ListPosts implements Posts {
    private List<Post> posts;

    public ListPosts(){
        posts = new ArrayList<>();
    }
    @Override
    public List<Post> allPosts() {
        return posts;
    }
    @Override
    public void savePost(Post post) {
        post.setId(posts.size() + 1);
        posts.add(post);
    }
    @Override
    public Post findPost(long id){return null;}

}
