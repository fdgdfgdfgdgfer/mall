package com.example.user.demos.web.model.dao.test;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.user.demos.web.model.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Author jfz
 * @Date 2024/4/1 15:21
 * @PackageName:com.example.user.demos.web.model.dao.test
 * @ClassName: TestDao
 */
@Mapper
public interface TestDao extends BaseMapper<TestEntity> {

}
