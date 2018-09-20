package com.hpe.sys.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hpe.sys.entity.SysUserEntity;
import com.hpe.sys.shiro.ShiroUtils;

/**
 * Controller公共组件
 */
public abstract class AbstractController {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	protected SysUserEntity getUser() {
		return ShiroUtils.getUserEntity();
	}

	protected Long getUserId() {
		return getUser().getUserId();
	}
}
