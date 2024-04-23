package com.jfz.improve.controller.controller;

import com.jfz.improve.response.ServerResponseEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author jfz
 * @Date 2024/4/23 21:26
 * @PackageName:com.jfz.improve.controller.controller
 * @ClassName: UserController
 */
@RestController
@RequestMapping("/platform/user")
@Api(value = "用户管理")
public class UserController {
    @PostMapping("/list")
    @ApiOperation("用户列表")
    public ServerResponseEntity<Map> list() {
        //TODO
        return null;
    }

    @PostMapping("/area")
    @ApiOperation("角色区域管理")
    public ServerResponseEntity<Map> area() {
        //TODO
        return null;
    }

    @PostMapping("/resource")
    @ApiOperation("角色资源")
    public ServerResponseEntity<Map> resource() {
        //TODO
        return null;
    }

    @PostMapping("/role")
    @ApiOperation("角色权限")
    public ServerResponseEntity<Map> role() {
        //TODO
        return null;
    }


}
