package com.jfz.improve.demos.web.model.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jfz.improve.demos.web.model.dao.SysMenuDao;
import com.jfz.improve.demos.web.model.entity.SysMenuEntity;
import com.jfz.improve.demos.web.model.service.SysMenuService;
import org.springframework.stereotype.Service;


@Service("sysMenuService")
public class SysMenuServiceImpl extends ServiceImpl<SysMenuDao, SysMenuEntity> implements SysMenuService {


}