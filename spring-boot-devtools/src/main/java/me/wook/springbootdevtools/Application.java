package me.wook.springbootdevtools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.setProperty("spring.devtools.restar")
		SpringApplication.run(Application.class, args);
	}

}
