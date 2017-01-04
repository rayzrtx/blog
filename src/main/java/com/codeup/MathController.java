package com.codeup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by raylinares on 1/4/17.
 */
@Controller
public class MathController {
    @GetMapping ("/add/{number1}/and/{number2}")
    @ResponseBody
    public String addition(@PathVariable int number1, @PathVariable int number2){
        return "<h1>" + number1 + " plus " + number2 + " equals " + (number1 + number2) + "</h1>";
    }
    @GetMapping ("/subtract/{number1}/from/{number2}")
    @ResponseBody
    public String subtraction(@PathVariable int number1, @PathVariable int number2){
        return "<h1>" + number1 + " from " + number2 + " equals " + (number2 - number1) + "</h1>";
    }
    @GetMapping ("/multiply/{number1}/and/{number2}")
    @ResponseBody
    public String multiply(@PathVariable int number1, @PathVariable int number2){
        return "<h1>" + number1 + " times " + number2 + " equals " + (number1 * number2) + "</h1>";
    }
    @GetMapping ("/divide/{number1}/by/{number2}")
    @ResponseBody
    public String divide(@PathVariable int number1, @PathVariable int number2){
        return "<h1>" + number1 + " divided by " + number2 + " equals " + (number1 / number2) + "</h1>";
    }

}
