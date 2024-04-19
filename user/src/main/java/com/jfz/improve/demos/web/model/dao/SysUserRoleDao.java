package com.jfz.improve.demos.web.model.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jfz.improve.demos.web.model.entity.SysUserRoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户与角色关系表
 * 
 * @author jfz
 * @email xjt3721@163.com
 * @date 2024-04-01 13:34:40
 */
@Mapper
public interface SysUserRoleDao extends BaseMapper<SysUserRoleEntity> {
	
}
