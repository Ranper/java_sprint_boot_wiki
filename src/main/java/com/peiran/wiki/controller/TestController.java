package com.peiran.wiki.controller;

import com.peiran.wiki.domain.Test;
import com.peiran.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController  // 返回字符串,json
//@Controller // 返回一个页面
public class TestController {

    @Value("${test.hello:NOT_CONFIG}")
    private  String test_hello;

    @Resource
    private TestService testService;   // 将testservice 注册进来
//    @RequestMapping("/hello")  //  支持所有的请求方式
    @RequestMapping("/hello")  //  支持所有的请求方式
//    @GetMapping()
//    @PostMapping
//    @PutMapping
//    @DeleteMapping
//    @RequestMapping(value = "/user/1", method = RequestMethod.GET)
    public String hello(){
        return "hello, world!  --by peiran  __ " + test_hello;
    }




    @GetMapping("/test/list")
    public List<Test> list(){
        return  testService.list();
    }

}
