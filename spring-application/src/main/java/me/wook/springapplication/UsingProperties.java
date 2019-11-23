package me.wook.springapplication;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

@Component
@ConfigurationProperties("wook")
@Validated
public class UsingProperties {
	@NotEmpty
	private String name;

	@Size(min = 1, max = 7)
	private String fullName;
	private int age;


//	@DurationUnit(ChronoUnit.SECONDS)
	private Duration sessionTimeout = Duration.ofSeconds(30);

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(final String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(final int age) {
		this.age = age;
	}

	public Duration getSessionTimeout() {
		return sessionTimeout;
	}

	public void setSessionTimeout(final Duration sessionTimeout) {
		this.sessionTimeout = sessionTimeout;
	}
}
