package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

//Load the first form
public class HomeController {
    @RequestMapping("/loadform")
    public String loadFormPage(){
        return "formtemplate";
    }
//Loads the second form with results
    @RequestMapping("/processform")
    public String loadFromPage(@RequestParam("username") String username, Model model){
        model.addAttribute("logval", username);
        return "confirm";
    }
}
