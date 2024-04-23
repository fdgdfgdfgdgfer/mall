package com.jfz.improve.controller.controller.business_api;

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
 * @Date 2024/4/23 21:43
 * @PackageName:com.jfz.improve.controller.controller.business_api
 * @ClassName: BusinessManagementController
 */
@RestController
@RequestMapping("/platform/business")
@Api(value = "商家后台管理")
public class BusinessManagementController {
    @PostMapping("/list")
    @ApiOperation("商家产品列表")
    public ServerResponseEntity<Map> list() {
        //TODO
        return null;
    }

    @PostMapping("/detail")
    @ApiOperation("商家产品详情")
    public ServerResponseEntity<Map> area() {
        //TODO
        return null;
    }

    @PostMapping("/add")
    @ApiOperation("商家产品新增")
    public ServerResponseEntity<Map> resource() {
        //TODO
        return null;
    }

    @PostMapping("/up")
    @ApiOperation("商家产品上下架")
    public ServerResponseEntity<Map> up() {
        //TODO
        return null;
    }
}
