package com.wfd360.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@RestController
@RequestMapping("/")
public class HelloController {
    /**
     * 获取首页
     */
    @RequestMapping("/index")
    public String index(String test) {

        return "succss"+test;
    }
}
