package com.codeup.posts;

import com.codeup.posts.DaoFactory;
import com.codeup.posts.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public String createPost(@Valid Post post, Errors validation, Model m) {
        if(validation.hasErrors()){
            m.addAttribute("errors", validation);       //validating that post meets minimum requirements set in Post
            m.addAttribute("post", post);
            return "/posts/create";
        }

        DaoFactory.getPostsDao().savePost(post); //save the posts

        return "redirect:/posts";
    }
    @GetMapping("/posts/{id}")
    public String showSinglePost(@PathVariable int id, Model m){
        Post post = DaoFactory.getPostsDao().findPost(id); //find a post based on post id and display on own page
        m.addAttribute("post", post);
        return "posts/show";
    }
    @GetMapping("/posts/{id}/edit")
    public String showEditForm(@PathVariable long id, Model m){
        Post post = DaoFactory.getPostsDao().findPost(id);  //use the passed id to find the record in db
        m.addAttribute("post", post);                       //add to the model
        return "posts/edit";
    }
    @PostMapping("/posts/{id}/edit")
    public String updatePost(@Valid Post editedPost, Errors validation, Model m){
        if (validation.hasErrors()){
            m.addAttribute("errors", validation);       //validating that post meets minimum requirements set in Post
            m.addAttribute("post", editedPost);
            return "/posts/edit";
        }

        Post post = DaoFactory.getPostsDao().findPost(editedPost.getId());  //use the passed id to find the record in db
        String updatedTitle = editedPost.getTitle();        //assigning updated title to new variable
        String updatedBody = editedPost.getBody();          //assigning updated body to new variable
        post.setTitle(updatedTitle);                        //updating title with updated title
        post.setBody(updatedBody);                          //updating body with updated body
        DaoFactory.getPostsDao().updatePost(post);          //updating record in db
        return "redirect:/posts/" + post.getId();
    }
    @PostMapping("/posts/{id}/delete")
    public String deletePost(@PathVariable long id){
        Post post = DaoFactory.getPostsDao().findPost(id);
        DaoFactory.getPostsDao().deletePost(post);
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