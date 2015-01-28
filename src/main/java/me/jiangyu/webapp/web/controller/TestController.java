package me.jiangyu.webapp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jiangyukun on 2014/11/21.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/{pageName}")
    public String nodeType(@PathVariable String pageName) {
        return "/webapp/" + pageName;
    }
}
