package com.codeup;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by raylinares on 1/5/17.
 */
@Controller
public class PostsController {

    @GetMapping("/posts")
    public String index(Model m){
        List<Post> posts = DaoFactory.getPostsDao().allPosts();
        m.addAttribute("posts", posts);
        return "posts/index";
    }
    @GetMapping("/posts/create")
    public String createForm(Model m){
        m.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post) {
        System.out.println("post submitted");
        DaoFactory.getPostsDao().savePost(post); //save the posts

        return "redirect:/posts";
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