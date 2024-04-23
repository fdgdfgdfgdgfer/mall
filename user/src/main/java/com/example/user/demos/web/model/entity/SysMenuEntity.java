package com.example.user.demos.web.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 权限表
 * 
 * @author jfz
 * @email xjt3721@163.com
 * @date 2024-04-01 13:34:40
 */
@Data
@TableName("sys_menu")
public class SysMenuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId(type = IdType.AUTO)
	private Long id;
	/**
	 * 权限名称
	 */
	private String name;
	/**
	 * 权限标识
	 */
	private String permission;

}
