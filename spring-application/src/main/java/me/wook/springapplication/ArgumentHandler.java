package me.wook.springapplication;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ArgumentHandler {

	public ArgumentHandler(ApplicationArguments arguments) {
		System.out.printf("foo: %s \n", arguments.containsOption("foo"));
		System.out.printf("bar: %s \n", arguments.containsOption("bar"));
	}
}
