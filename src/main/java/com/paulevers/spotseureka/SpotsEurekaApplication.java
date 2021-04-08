package com.paulevers.spotseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpotsEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpotsEurekaApplication.class, args);
	}

}
