package com.jfz.improve.controller.controller.system_api;

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
 * @Date 2024/4/23 21:30
 * @PackageName:com.jfz.improve.controller.controller
 * @ClassName: MerchantManagementController
 */
@RestController
@RequestMapping("/platform/merchant")
@Api(value = "商家管理")
public class MerchantManagementController {

    @PostMapping("/list")
    @ApiOperation("商家")
    public ServerResponseEntity<Map> list() {
        //TODO
        return null;
    }

    @PostMapping("/detail")
    @ApiOperation("商家详情")
    public ServerResponseEntity<Map> detail() {
        //TODO
        return null;
    }
}
