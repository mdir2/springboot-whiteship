package me.wook.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStarterApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootStarterApplication.class, args);
		SpringApplication application = new SpringApplication(SpringBootStarterApplication.class);
		application.setWebApplicationType(WebApplicationType.SERVLET);
		application.run(args);
	}

}
