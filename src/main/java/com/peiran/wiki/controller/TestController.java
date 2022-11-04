package com.peiran.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // 返回字符串,json
//@Controller // 返回一个页面
public class TestController {

    @Value("${test.hello:NOT_CONFIG}")
    private  String test_hello;
//    @RequestMapping("/hello")  //  支持所有的请求方式
    @RequestMapping("/hello")  //  支持所有的请求方式
//    @GetMapping()
//    @PostMapping
//    @PutMapping
//    @DeleteMapping
//    @RequestMapping(value = "/user/1", method = RequestMethod.GET)
    public String hello(){
        return "hello, world!  --by peiran" + test_hello;
    }
}
