package me.wook.springbootdevtools.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

	@Bean
	public String hello() {
		return "taewook Kim";
	}
}
