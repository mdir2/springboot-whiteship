package me.wook.springbootstarter;

import me.wook.autoconfig.Holoman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootStarterApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootStarterApplication.class, args);
		SpringApplication application = new SpringApplication(SpringBootStarterApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

//	@Bean
//	Holoman holoman() {
//		// 패키지 부터 스캔하고 난 후에 autoconfig 빈 등록을 하기때문에 덮어짐.
//		// 그런데 스프링레거시에서는 Exception 발생함 중복되는 빈등록을 하려고 하면
//		Holoman holoman = new Holoman();
//		holoman.setName("wook");
//		holoman.setHowLong(55);
//		return holoman;
//	}
}
