package com.peiran.wiki.controller;

import com.peiran.wiki.domain.Demo;
import com.peiran.wiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController  // 返回字符串,json
//@Controller // 返回一个页面
@RequestMapping("/demo")  // 所有/demo为前缀的请求都打到这里来 后面可以没有前缀/demo了
public class DemoController {
    @Resource
    private DemoService demoService;   // 将 demoservice 注册进来

    @GetMapping("/list")
    public List<Demo> list(){
        return  demoService.list();
    }

}
