package me.wook.springapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties(UsingProperties.class)
public class Application {

	public static void main(String[] args) {
		// way to start application 1
		SpringApplication.run(Application.class, args);

		// way to start application 2
		//SpringApplication application = new SpringApplication();
		//application.run(Application.class);

		// way to start application 3
		//new SpringApplicationBuilder()
		//		.sources(Application.class)
		//		.run(args);

		// add Listener that is made before application context start on Spring Boot
		//SpringApplication app = new SpringApplication(Application.class);
		//app.addListeners(new StartingListener());
		//app.run(args);

		// add Listener that is made after application context start on Spring Boot
		//SpringApplication.run(Application.class, args);

		// if you wanna use `reactive` on web application type
		//SpringApplication app = new SpringApplication();
		//app.setWebApplicationType(WebApplicationType.REACTIVE);
		//app.run(args);
	}
}
