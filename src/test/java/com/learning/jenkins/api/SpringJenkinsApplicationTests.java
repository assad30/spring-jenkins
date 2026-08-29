package com.learning.jenkins.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

@SpringBootTest
class SpringJenkinsApplicationTests {

	public static Logger logger = (Logger) LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);


	@Test
	void contextLoads() {
		logger.info("Test case execution started ..");
        Assertions.assertTrue(true);
	}

}
