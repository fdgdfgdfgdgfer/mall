package com.jfz.improve.controller.controller;

import com.jfz.improve.model.entity.SysUserEntity;
import com.jfz.improve.model.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author jfz
 * @Date 2024/4/9 11:50
 * @PackageName:com.example.platform.controller.controller
 * @ClassName: LoginCotroller
 */
@RestController
@RequestMapping("/platform")
@Api(value = "后台")
public class LoginController {

    @Resource
    private SysUserService sysUserService;

    @ApiOperation("登录")
    @PostMapping("/login")
    public Map<String, SysUserEntity> login(Map<String, String> user) {
        sysUserService.listMaps();
        return null;
    }
}
