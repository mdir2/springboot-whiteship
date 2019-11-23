package me.wook.springapplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
//@TestPropertySource(properties = "wook.name=wook2")
@TestPropertySource(locations = "classpath:/test.properties")
@SpringBootTest
public class ApplicationTests {

	@Autowired
	Environment environment;

	@Test
	public void contextLoads() {
		assertThat(environment.getProperty("wook.name"))
				.isEqualTo("Holoman");
	}
}