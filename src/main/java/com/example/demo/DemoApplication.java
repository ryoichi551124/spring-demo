package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.TargetService;

/**
 * SpringBoot起動クラス
 */
@SpringBootApplication
public class DemoApplication {
	/** 起動 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args)
		.getBean(DemoApplication.class).execute();
	}

	/** DI */
	@Autowired
	private TargetService service;

	/** 実行 */
	private void execute() {
		service.sayHello("太郎");
		System.out.println("**************");
		service.sayGoodBye("花子");
	}
}
