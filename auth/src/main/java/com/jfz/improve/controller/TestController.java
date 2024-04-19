package com.jfz.improve.controller;

import com.jfz.improve.response.ServerResponseEntity;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author jfz
 * @Date 2024/4/3 11:02
 * @PackageName:com.example.auth.controller
 * @ClassName: TestController
 */
@RestController
@RequestMapping(value = "/test")
@Api(tags = "test")
public class TestController {

    @GetMapping("/test")
    private ServerResponseEntity<String> test(){
        return ServerResponseEntity.success("succ");
    }
}