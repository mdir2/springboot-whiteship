package me.wook.springapplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("prod")
@Configuration
public class ProdConfiguration {

	@Bean
	public String hello() {
		return "hello";
	}
}
