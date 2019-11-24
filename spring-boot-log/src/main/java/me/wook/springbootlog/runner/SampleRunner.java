package me.wook.springbootlog.runner;

import me.wook.springbootlog.WookProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

	private Logger logger = LoggerFactory.getLogger(SampleRunner.class);

	@Autowired
	private WookProperties wookProperties;

	@Override
	public void run(final ApplicationArguments args) throws Exception {
		logger.info("==========================");
		logger.info(wookProperties.getName());
		logger.info("==========================");
	}
}
