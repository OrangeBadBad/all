package com.pengzc.blog.controller;

import com.pengzc.blog.entity.DemoEntity;
import com.pengzc.blog.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName DemoController
 * @Description
 * @Auth pengzc
 * @Date 2018/12/2
 **/
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    /**
     * Demo
     */
    @GetMapping(value = "/demo")
    public List<DemoEntity> profile() {

        return demoService.getAll();
    }
}
