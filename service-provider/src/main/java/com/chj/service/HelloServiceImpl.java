package com.chj.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.chj.openapi.HelloService;

@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name + " !!!";
	}

}
