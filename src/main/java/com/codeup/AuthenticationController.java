package com.codeup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by raylinares on 1/10/17.
 */
@Controller
public class AuthenticationController {
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
}
