package com.bigdata.recomnd.rankusercount.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountController {

    @RequestMapping("/hello")
    public String index(){
        return "hello index";
    }
}
