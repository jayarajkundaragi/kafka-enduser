package com.enduser.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndUserController {
	
	@GetMapping("/test")
	public String test() {
		return "test1";
	}
	
	@GetMapping("/getSample")
	public ResponseEntity<Object> sampleApi(){
		return new ResponseEntity<Object>("Success",HttpStatus.OK);
	}
}
