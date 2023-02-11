package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.globes.entity")
@EnableJpaRepositories(basePackages = "com.globes.repository")
@EnableEurekaClient
public class ResvcabApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResvcabApplication.class, args);
		System.out.println("Resvcab Microservice Up!");
	}

}
