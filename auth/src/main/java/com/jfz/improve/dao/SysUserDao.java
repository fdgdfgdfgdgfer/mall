package com.jfz.improve.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jfz.improve.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 系统用户表
 * 
 * @author jfz
 * @email xjt3721@163.com
 * @date 2024-04-01 13:34:40
 */
@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {
    List<String> selectRoleByUserId(@Param("userId") Long userId);
}
