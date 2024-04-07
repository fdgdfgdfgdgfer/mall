package org.example.order.controller;


import org.example.order.dao.TestEntity;
import org.example.order.feign.UserService;
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
@RequestMapping("/order")
public class TestController {
    @Resource
    private UserService userService;

    @GetMapping("/test")
    public List<TestEntity> userInfo() {
        return userService.test();
    }
}
