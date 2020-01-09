package com.study.dev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //(Responsebody + Controller)
public class HelloController {

    @GetMapping("/hello") // 경로 설정
    public String hello() {
        return "hello";
    }
}
