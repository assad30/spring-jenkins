package com.learning.jenkins.api;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger = (Logger) LoggerFactory.getLogger(SpringJenkinsApplication.class);

	public void init(){
		logger.info("Application initialized ....");
	}

	public static void main(String[] args) {
		logger.info("Application started .....");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
