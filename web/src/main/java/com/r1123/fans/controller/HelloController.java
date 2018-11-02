package com.r1123.fans.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by helloqdz on 2018/11/1.
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping("/x")
    public String hello(){
        return "hello";
    }
}
