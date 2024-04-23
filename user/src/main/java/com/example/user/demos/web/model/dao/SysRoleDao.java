package com.example.user.demos.web.model.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.user.demos.web.model.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色表
 * 
 * @author jfz
 * @email xjt3721@163.com
 * @date 2024-04-01 13:34:40
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {

}
