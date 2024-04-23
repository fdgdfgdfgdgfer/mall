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
 * @Date 2024/4/23 21:32
 * @PackageName:com.jfz.improve.controller.controller
 * @ClassName: AuditsManagementController
 */
@RestController
@RequestMapping("/platform/audits")
@Api(value = "审核管理")
public class AuditsManagementController {
    @PostMapping("/list")
    @ApiOperation("商家认证列表")
    public ServerResponseEntity<Map> list() {
        //TODO
        return null;
    }

    @PostMapping("/details")
    @ApiOperation("商家认证详情")
    public ServerResponseEntity<Map> details() {
        //TODO
        return null;
    }

    @PostMapping("/audis")
    @ApiOperation("商家认证审核")
    public ServerResponseEntity<Map> audis() {
        //TODO
        return null;
    }

}
