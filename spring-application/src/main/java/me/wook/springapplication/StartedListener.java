package me.wook.springapplication;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class StartedListener implements ApplicationListener<ApplicationStartedEvent> {
	@Override
	public void onApplicationEvent(final ApplicationStartedEvent event) {
		System.out.println("======================");
		System.out.println("Application is staring");
		System.out.println("======================");
	}
}
