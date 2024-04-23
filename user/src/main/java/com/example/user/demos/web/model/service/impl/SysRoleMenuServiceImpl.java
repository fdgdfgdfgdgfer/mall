package com.example.user.demos.web.model.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.user.demos.web.model.dao.SysRoleMenuDao;
import com.example.user.demos.web.model.entity.SysRoleMenuEntity;
import com.example.user.demos.web.model.service.SysRoleMenuService;
import org.springframework.stereotype.Service;


@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuDao, SysRoleMenuEntity> implements SysRoleMenuService {



}