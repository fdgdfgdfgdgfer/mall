package org.example.order.feign;

import org.example.order.config.FeignConfig;
import org.example.order.dao.TestEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author jfz
 * @Date 2024/4/3 20:52
 * @PackageName:org.example.order.config.feign
 * @ClassName: UserService
 */
@FeignClient(value = "user",configuration = FeignConfig.class)
public interface UserService {
    @GetMapping("/forTest/test")
    List<TestEntity> test();
}
