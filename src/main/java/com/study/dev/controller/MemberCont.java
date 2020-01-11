package com.study.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.ArrayList;

@Controller
public class MemberCont {

    private List<Member> members = new ArrayList<Member>();

    @RequestMapping(value = "create.do", method = {RequestMethod.GET,RequestMethod.POST})
    public String create(Member member){
        System.out.println(members);
        members.add(member);
        System.out.println("member" + member);
        return "form";
    }

    @RequestMapping(value = "list.do", method = {RequestMethod.GET,RequestMethod.POST})
    public String list(Model model){
        System.out.println(members);
        model.addAttribute("members",members);
        System.out.println(members);
        return "list";
    }
}
