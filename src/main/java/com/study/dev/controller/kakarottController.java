package com.study.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class kakarottController {
    @GetMapping("/helloworld")
    public String welcome(Model model, String name, int age){
        System.out.println("name : " + name);
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "welcome";
    }

}
