package com.RoomMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RoomMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomMicroserviceApplication.class, args);
	}

}
