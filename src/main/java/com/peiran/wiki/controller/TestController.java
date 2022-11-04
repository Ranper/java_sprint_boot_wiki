package com.peiran.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController  // 返回字符串,json
//@Controller // 返回一个页面
public class TestController {

//    @RequestMapping("/hello")  //  支持所有的请求方式
    @RequestMapping("/hello")  //  支持所有的请求方式
//    @GetMapping()
//    @PostMapping
//    @PutMapping
//    @DeleteMapping
//    @RequestMapping(value = "/user/1", method = RequestMethod.GET)
    public String hello(){
        return "hello, world!  --by peiran";
    }
}
