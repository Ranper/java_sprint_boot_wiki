package com.peiran.wiki.controller;

import com.peiran.wiki.req.EbookReq;
import com.peiran.wiki.resp.CommonResp;
import com.peiran.wiki.resp.EbookResp;
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

    // 为了再需求变更时，减少代码变化，将请求封装为一个类
    @GetMapping("/list")
    public CommonResp list(EbookReq req){  // 模糊匹配，返回给定name的相关信息
//        System.out.println("get req: name = " + name);
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        resp.setSuccess(true);
        resp.setContent(list);
        return resp;
    }

}
