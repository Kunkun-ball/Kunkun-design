package com.hukun.graduation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.hukun.graduation")
public class DesignApplication {
	
	public static void main(String args[]) {
		SpringApplication.run(DesignApplication.class, args);
	}
}
