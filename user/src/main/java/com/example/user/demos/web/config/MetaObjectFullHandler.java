package com.example.user.demos.web.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @Author jfz
 * @Date 2024/4/1 15:49
 * @PackageName:com.example.user.demos.web.config
 * @ClassName: MetaObjectHandler
 * 自定义数据库表字段填充时间
 */
@Component
@Slf4j
public class MetaObjectFullHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("create a line data...");
        this.strictInsertFill(metaObject, "createTime", LocalDateTime.class, LocalDateTime.now());
        this.strictUpdateFill(metaObject, "updateTime",
                LocalDateTime.class,
                LocalDateTime.now()
        );
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("update one line data...");
        this.strictUpdateFill(metaObject, "updateTime",
                LocalDateTime.class,
                LocalDateTime.now()
        );
    }
}
