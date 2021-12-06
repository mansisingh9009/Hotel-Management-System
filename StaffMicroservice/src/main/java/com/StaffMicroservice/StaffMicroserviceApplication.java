package com.StaffMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class StaffMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaffMicroserviceApplication.class, args);
	}

}
