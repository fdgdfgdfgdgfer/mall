package com.example.user.demos.web.model.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.user.demos.web.model.dao.SysRoleDao;
import com.example.user.demos.web.model.entity.SysRoleEntity;
import com.example.user.demos.web.model.service.SysRoleService;
import org.springframework.stereotype.Service;


@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleDao, SysRoleEntity> implements SysRoleService {



}