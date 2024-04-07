package com.example.user.demos.web.model.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.user.demos.web.model.dao.SysUserRoleDao;
import com.example.user.demos.web.model.entity.SysUserRoleEntity;
import com.example.user.demos.web.model.service.SysUserRoleService;
import org.springframework.stereotype.Service;


@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleDao, SysUserRoleEntity> implements SysUserRoleService {


}