package com.jfz.improve.demos.web.model.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jfz.improve.demos.web.model.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户表
 * 
 * @author jfz
 * @email xjt3721@163.com
 * @date 2024-04-01 13:34:40
 */
@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {
	
}
