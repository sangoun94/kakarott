package com.study.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberCreate {
    @PostMapping("/create.do")
    public String create(Member member){
        System.out.println("member" + member);
        return "index";
    }
}
