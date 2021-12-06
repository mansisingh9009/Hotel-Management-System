package com.InventoryMicroservice;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
public class InventoryController {
	@GetMapping("/Inventory")
	  public String Hello() {
		  return "Hello World!!";
	  }
}