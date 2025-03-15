package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.example.Example;

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
	private Example example;

	/** 実行 */
	private void execute() {
		example.run();
	}
}
