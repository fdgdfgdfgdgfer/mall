package com.example.user.demos.web.controller;


import com.example.user.demos.web.model.entity.TestEntity;
import com.example.user.demos.web.model.service.TestService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * @Author jfz
 * @Date 2024/3/11 16:12
 * @PackageName:com.example.user.demos.web.controller
 * @ClassName: Controller
 */
@RestController
@RequestMapping("/forTest")
public class TestController {
    @Resource
    private TestService testService;

    @GetMapping("/test")
    public List<TestEntity> userInfo() {
        return testService.getBaseMapper().selectList(null);
    }
}
