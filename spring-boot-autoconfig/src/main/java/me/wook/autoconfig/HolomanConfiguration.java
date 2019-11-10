package me.wook.autoconfig;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = HolomanProperties.class)
public class HolomanConfiguration {

//	@Bean
//	@ConditionalOnMissingBean
//	public Holoman holoman() {
//		Holoman holoman = new Holoman();
//		holoman.setName("wook");
//		holoman.setHowLong(33);
//		return holoman;
//	}

	@Bean
	@ConditionalOnMissingBean
	public Holoman holoman(HolomanProperties properties) {
		Holoman holoman = new Holoman();
		holoman.setName(properties.getName());
		holoman.setHowLong(properties.getHowLong());
		return holoman;
	}
}
