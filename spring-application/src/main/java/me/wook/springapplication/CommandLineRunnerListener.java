package me.wook.springapplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CommandLineRunnerListener implements CommandLineRunner {
	@Override
	public void run(final String... args) throws Exception {
		Arrays.stream(args).forEach(System.out::println);
	}
}