package com.yb.study.mymvc.demo.service.impl;

import com.yb.study.mymvc.demo.service.IDemoService;
import com.yb.study.mymvc.mvcframework.annotation.MyService;

/**
 * 核心业务逻辑
 */
@MyService
public class DemoService implements IDemoService {

	public String get(String name) {
		return "My name is " + name;
	}

}
