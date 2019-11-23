package me.wook.springapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerListener implements ApplicationRunner {

	@Autowired
	private UsingProperties usingProperties;

//	using .properties file
//	@Value("${wook.name}")
//	private String name;
//
//	@Value("${wook.age}")
//	private int age;
//
//	@Value("${wook.fullName}")
//	private String fullName;

	@Autowired
	private String hello;

	@Override
	public void run(final ApplicationArguments args) throws Exception {
		//	using .properties file
//		System.out.println("======================");
//		System.out.println(fullName);
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println("======================");

		//	using custom properties class
// 		System.out.println("======================");
//		System.out.println(usingProperties.getFullName());
//		System.out.println(usingProperties.getName());
//		System.out.println(usingProperties.getAge());
//		System.out.println(usingProperties.getSessionTimeout());
//		System.out.println("======================");

		// BaseConfiguration Test
 		System.out.println("======================");
		System.out.println(hello);
 		System.out.println("======================");

 		// priority properties
		System.out.println("======================");
		System.out.println(usingProperties.getName());
		System.out.println("======================");

		// include properties
		System.out.println("======================");
		System.out.println(usingProperties.getFullName());
		System.out.println("======================");
	}

	// using arguments
//	@Override
//	public void run(final ApplicationArguments args) throws Exception {
//		System.out.printf("Runner foo: %s \n", args.containsOption("foo"));
//		System.out.printf("Runner bar: %s \n", args.containsOption("bar"));
//	}
}