package com.codeup.posts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by raylinares on 1/10/17.
 */
@Controller
public class AuthenticationController {
    @GetMapping("/login")
    public String showLoginForm() {
        return "posts/login";
    }
    @GetMapping("/posts/register")
    public String showRegisterForm(){
        return "posts/register";
    }
}
