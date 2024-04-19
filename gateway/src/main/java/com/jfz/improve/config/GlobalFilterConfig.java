//package com.example.gateway.config;
//
//
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.core.annotation.Order;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.server.reactive.ServerHttpRequest;
//import org.springframework.stereotype.Component;
//import org.springframework.util.MultiValueMap;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//
///**
// * @Author jfz
// * @Date 2024/3/8 16:47
// * @PackageName:com.example.gateway.config
// * @ClassName: GlobalFilter
// */
//@Component
//@Order(-1)
//public class GlobalFilterConfig implements GlobalFilter {
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        //获得请求体
//        ServerHttpRequest request = exchange.getRequest();
//        MultiValueMap<String, String> queryParams = request.getQueryParams();
//        //获取校验参数
//        String authorization = queryParams.getFirst("authorization");
//        //设置返回状态信息
//        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
//        if (null == authorization) {
//            return exchange.getResponse().setComplete();
//        }
//        if("admin".equals(authorization)){
//            //放行
//            return chain.filter(exchange);
//        }
//        return null;
//    }
//}
