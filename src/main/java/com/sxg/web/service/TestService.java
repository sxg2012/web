package com.sxg.web.service;

import com.sxg.web.domain.Suggest;
import com.sxg.web.mapper.SuggestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by shaoxiangen 2018/2/3
 */
@Service
public class TestService {

    @Resource
    private SuggestMapper suggestMapper;

    public void test() {
        Suggest suggest = suggestMapper.queryById(784623);
        System.out.println(suggest.getChineseName());
    }
}
