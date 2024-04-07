package com.example.auth.controller;

import com.example.response.ServerResponseEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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