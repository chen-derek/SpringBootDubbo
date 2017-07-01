package com.chj.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chj.openapi.HelloService;

@RestController
public class TestController {

	@Autowired
	HelloService helloService;

	@RequestMapping({ "/", "/test1" })
	public String Test1() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 10; i++) {
			sb.append(helloService.sayHello("Derek " + new Random().nextInt(100))).append(System.getProperty("line.separator"));
		}
		return sb.toString();
	}

}
