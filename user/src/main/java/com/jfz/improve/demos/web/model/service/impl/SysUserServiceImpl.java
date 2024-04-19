package com.jfz.improve.demos.web.model.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jfz.improve.demos.web.model.dao.SysUserDao;
import com.jfz.improve.demos.web.model.entity.SysUserEntity;
import com.jfz.improve.demos.web.model.service.SysUserService;
import org.springframework.stereotype.Service;


@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUserEntity> implements SysUserService {



}