package me.wook.springapplication;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerListener implements ApplicationRunner {
	@Override
	public void run(final ApplicationArguments args) throws Exception {
		System.out.printf("Runner foo: %s \n", args.containsOption("foo"));
		System.out.printf("Runner bar: %s \n", args.containsOption("bar"));
	}
}