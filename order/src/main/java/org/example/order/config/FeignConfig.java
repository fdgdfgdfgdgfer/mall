package org.example.order.config;

import com.alibaba.cloud.commons.lang.StringUtils;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Description feign客户端配置-设置自定义请求头
 * @ClassName FeignConfig
 * @Author 康世行
 * @Date 11:24 2022/6/23
 * @Version 1.0
 **/
@Configuration
public class FeignConfig implements RequestInterceptor {



    @Override
    public void apply(RequestTemplate requestTemplate) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String accessToken = request == null ? StringUtils.EMPTY : request.getHeader(HttpHeaders.AUTHORIZATION);
        System.out.println("=================Feign Interceptor AccessToken: " + accessToken);
        requestTemplate.header(HttpHeaders.AUTHORIZATION, accessToken);
    }
}

