package me.wook.springbootstarter;

import me.wook.autoconfig.Holoman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HolomanRunner implements ApplicationRunner {

	@Autowired
	private Holoman holoman;

	@Override
	public void run(final ApplicationArguments args) throws Exception {
		System.out.println(holoman.toString());
	}
}

