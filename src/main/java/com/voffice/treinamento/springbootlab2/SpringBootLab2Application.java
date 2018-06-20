package com.voffice.treinamento.springbootlab2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringBootLab2Application {
	
	@Value("${voffice.treinamento}")
	private String treinamento;
	
	@Autowired
	public Environment env;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLab2Application.class, args);
	}
	
	public String getAppName() {
		String appName = env.getProperty("spring.application.name");
		logger.info("Environment App name: {}", appName);
		return appName;
	}
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("---------------");
		logger.info("Lab properties");
		logger.info("Lab2 App name: {}", name);
		logger.info("Lab2 App description: {}", description);
		logger.info("---------------");
		logger.info("Env properties");
		getAppName();
	}
}
