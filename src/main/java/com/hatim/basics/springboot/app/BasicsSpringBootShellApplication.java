package com.hatim.basics.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.hatim.basics.springboot"})
public class BasicsSpringBootShellApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicsSpringBootShellApplication.class, args);
	}
	
}
