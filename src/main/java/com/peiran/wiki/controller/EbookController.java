package com.peiran.wiki.controller;

import com.peiran.wiki.domain.Ebook;
import com.peiran.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController  // 返回字符串,json
//@Controller // 返回一个页面
@RequestMapping("/ebook")  // 所有/ebook为前缀的请求都打到这里来 后面可以没有前缀/ebook了
public class EbookController {
    @Resource
    private EbookService ebookService;   // 将 ebookservice 注册进来

    @GetMapping("/list")
    public List<Ebook> list(){
        return  ebookService.list();
    }

}
