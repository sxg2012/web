package com.sxg.web.controller;

import com.sxg.web.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by shaoxiangen 2018/2/3
 */
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("/test")
    public void test() {
        testService.test();
    }
}
