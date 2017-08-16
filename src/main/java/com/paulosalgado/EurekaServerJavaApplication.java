package com.paulosalgado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerJavaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerJavaApplication.class, args);
	}
	
}
