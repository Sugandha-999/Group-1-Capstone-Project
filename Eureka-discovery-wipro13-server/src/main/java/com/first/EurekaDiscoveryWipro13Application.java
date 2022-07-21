package com.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoveryWipro13Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoveryWipro13Application.class, args);
	}

}
