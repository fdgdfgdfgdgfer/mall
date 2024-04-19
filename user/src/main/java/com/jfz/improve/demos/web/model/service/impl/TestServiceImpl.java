package com.jfz.improve.demos.web.model.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jfz.improve.demos.web.model.dao.test.TestDao;
import com.jfz.improve.demos.web.model.entity.TestEntity;
import com.jfz.improve.demos.web.model.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @Author jfz
 * @Date 2024/4/1 15:24
 * @PackageName:com.example.user.demos.web.model.service.impl
 * @ClassName: TestServiceImpl
 */
@Service("TestService")
public class TestServiceImpl extends ServiceImpl<TestDao, TestEntity> implements TestService {
}
