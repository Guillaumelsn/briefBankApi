package com.briefBankApi.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={
"com.briefBankApi.api", "com.briefBankApi.api.*"})
public class BriefBankApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BriefBankApiApplication.class, args);
	}

}
