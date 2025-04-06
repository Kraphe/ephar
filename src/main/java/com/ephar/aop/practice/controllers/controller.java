package com.ephar.aop.practice.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class controller {
    @GetMapping("is")
    public String  get(){
        return "hello";
    }
}
