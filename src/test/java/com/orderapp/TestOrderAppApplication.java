package com.orderapp;

import org.springframework.boot.SpringApplication;

public class TestOrderAppApplication {

	public static void main(String[] args) {
		SpringApplication.from(OrderAppApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
