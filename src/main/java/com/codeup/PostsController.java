package com.codeup;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by raylinares on 1/5/17.
 */
@Controller
public class PostsController {

    @GetMapping("/posts")
    public String index(Model m){
        List<Post> posts = DaoFactory.getPostsDao().allPosts(); //to show all posts in db
        m.addAttribute("posts", posts);
        return "posts/index";
    }
    @GetMapping("/posts/create")
    public String createForm(Model m){
        m.addAttribute("post", new Post());   //to create a new blog post via the form
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post) {
        System.out.println("post submitted");
        DaoFactory.getPostsDao().savePost(post); //save the posts

        return "redirect:/posts";
    }
    @GetMapping("/posts/{id}")
    public String showSinglePost(@PathVariable int id, Model m){
        Post post = DaoFactory.getPostsDao().findPost(id); //find a post based on post id and display on own page
        m.addAttribute("post", post);
        return "posts/show";
    }
}





    //@RequestParam(name = "id") Integer id,
    //@RequestParam(name = "title") String title,
    //
// @RequestParam(name = "body") String body
//System.out.println(id);
  //      System.out.println(title);
    //    System.out.println(body);

      //  Post post = new Post();
        //post.setId(id);
        //post.setTitle(title);
        //post.setBody(body);