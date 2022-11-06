package com.peiran.wiki.service;

import com.peiran.wiki.domain.Ebook;
import com.peiran.wiki.domain.EbookExample;
import com.peiran.wiki.mapper.EbookMapper;
import com.peiran.wiki.req.EbookReq;
import com.peiran.wiki.resp.EbookResp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;


    public List<EbookResp> list(EbookReq req){
        // 下面两行为固定语句
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");  // 对like的封装
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        List<EbookResp> respList = new ArrayList<>();
        for (Ebook ebook : ebookList) {
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook, ebookResp);
            respList.add(ebookResp);
        }
        return respList;
    }
}
