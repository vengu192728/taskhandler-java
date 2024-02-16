package com.taskhandler.dailytask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.taskhandler.dailytask")
public class DailytaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailytaskApplication.class, args);
	}

}
