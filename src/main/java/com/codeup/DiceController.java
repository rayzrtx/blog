package com.codeup;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by raylinares on 1/4/17.
 */
@Controller
public class DiceController {
    @GetMapping ("/roll-dice")
    public String rollDice(){
        return "roll-dice";
    }
    @GetMapping ("/formatting")
    public String format(@PathVariable String productName, Model model){
        model.addAttribute("productName", productName);
        return "formatting";
    }
}
