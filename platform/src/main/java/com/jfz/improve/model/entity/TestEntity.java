package com.jfz.improve.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author jfz
 * @Date 2024/4/1 15:19
 * @PackageName:com.example.user.demos.web.model.entity
 * @ClassName: TestEntity
 */
@Data
@TableName("test")
public class TestEntity {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String testOne;
    private String testTwo;
    @TableLogic
    private Integer deleted;
    @TableField(fill = FieldFill.INSERT) //字段填充
    private LocalDateTime createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE) //字段填充
    private LocalDateTime updateTime;
    @Version  //乐观锁
    private Integer version;
}
