package com.pengzc.blog.controller;

import com.pengzc.blog.entity.DemoEntity;
import com.pengzc.blog.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName DemoController
 * @Description
 * @Auth pengzc
 * @Date 2018/12/2
 **/
@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

    /**
     * Demo
     */
    @GetMapping(value = "/demo")
    public String profile(ModelMap modelMap) {

        List result = demoService.getAll();
        modelMap.addAttribute("test","1111");
        modelMap.addAttribute("aaa",result);
        return "hello";
    }
}
