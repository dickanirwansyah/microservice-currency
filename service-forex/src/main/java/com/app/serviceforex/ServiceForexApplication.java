package com.app.serviceforex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceForexApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceForexApplication.class, args);
	}
}
