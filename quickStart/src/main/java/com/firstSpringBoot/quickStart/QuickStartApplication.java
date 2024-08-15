//This is the start point of the application

package com.firstSpringBoot.quickStart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//This annotation is like a identifier for the entry point of an application
@SpringBootApplication
public class QuickStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickStartApplication.class, args);
	}

}
