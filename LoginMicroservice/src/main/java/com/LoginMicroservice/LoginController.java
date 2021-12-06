package com.LoginMicroservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@GetMapping("/Login")
	  public String Hello() {
		  return "Hello World!!";
	  }
}