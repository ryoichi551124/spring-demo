package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.BusinessLogic;

/**
 * SpringBoot起動クラス
 */
@SpringBootApplication
public class DemoApplication {
	/**
	 * SpringBoot起動
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args)
		.getBean(DemoApplication.class).execute();
	}

	/** DI */
	@Autowired
	@Qualifier("test")
	private BusinessLogic business1; // TestLogicImplのインスタンス

	/** DI */
	@Autowired
	@Qualifier("sample")
	private BusinessLogic business2; // SampleLogicImplのインスタンス

	/**
	 * 実行
	 */
	private void execute() {
		business1.doLogic();
		business2.doLogic();
	}
}
