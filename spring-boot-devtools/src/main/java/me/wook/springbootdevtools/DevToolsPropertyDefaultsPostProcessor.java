package me.wook.springbootdevtools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DevToolsPropertyDefaultsPostProcessor implements EnvironmentPostProcessor {

	private static final Map<String, Object> PROPERTIES;

	static {
		Map<String, Object> devToolsProperties = new HashMap<>();
		devToolsProperties.put("spring.thymeleaf.cache", "false");
		devToolsProperties.put("spring.freemarker.cache", "false");
		devToolsProperties.put("spring.groovy.template.cache", "false");
		devToolsProperties.put("spring.mustache.cache", "false");
		devToolsProperties.put("server.servlet.session.persistent", "true");
		devToolsProperties.put("spring.h2.console.enabled", "true");
		devToolsProperties.put("spring.resources.cache.period", "0");
		devToolsProperties.put("spring.resources.chain.cache", "false");
		devToolsProperties.put("spring.template.provider.cache", "false");
		devToolsProperties.put("spring.mvc.log-resolved-exception", "true");
		devToolsProperties.put("server.servlet.jsp.init-parameters.development", "true");
		devToolsProperties.put("spring.reactor.stacktrace-mode.enabled", "true");
		PROPERTIES = Collections.unmodifiableMap(devToolsProperties);
	}


	@Override
	public void postProcessEnvironment(final ConfigurableEnvironment environment, final SpringApplication application) {
		PropertySource<?> propertySource = new MapPropertySource("refresh",
				PROPERTIES);
		environment.getPropertySources().addLast(propertySource);
	}
}