package me.wook.springapplication;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

public class StartingListener implements ApplicationListener<ApplicationStartingEvent> {
	@Override
	public void onApplicationEvent(final ApplicationStartingEvent event) {
		System.out.println("======================");
		System.out.println("Application is staring");
		System.out.println("======================");
	}
}
