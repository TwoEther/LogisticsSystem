package com.java.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping(value = "/api/test")
    @ResponseBody
    public List<String> home(){
        return Arrays.asList("리액트 스프링", "연결 성공");
    }
}
