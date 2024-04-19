package com.jfz.improve.model.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jfz.improve.model.dao.SysUserRoleDao;
import com.jfz.improve.model.entity.SysUserRoleEntity;
import com.jfz.improve.model.service.SysUserRoleService;
import org.springframework.stereotype.Service;


@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleDao, SysUserRoleEntity> implements SysUserRoleService {


}