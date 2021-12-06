package com.ReservationMicroservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {
	@GetMapping("/Reservation")
	  public String bye() {
		  return "Hello World!!";
	  }
}