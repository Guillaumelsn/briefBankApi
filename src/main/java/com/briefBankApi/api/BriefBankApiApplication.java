package com.briefBankApi.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.briefBankApi.api.repository.ClientRepository"})
@EnableJpaRepositories("com.briefBankApi.api.repository")
public class BriefBankApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BriefBankApiApplication.class, args);
	}

}
