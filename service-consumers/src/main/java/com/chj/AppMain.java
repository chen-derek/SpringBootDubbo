package com.chj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.chj.openapi.HelloService;

@SpringBootApplication
public class AppMain {

	static final Logger logger = LoggerFactory.getLogger(AppMain.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AppMain.class, args);
	}

}
