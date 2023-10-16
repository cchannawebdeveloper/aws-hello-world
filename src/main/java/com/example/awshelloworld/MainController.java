package com.example.awshelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class MainController {
	
	@GetMapping(value = {"/home","/"})
	public String helloHome() {
		return new String("Hello Home Page!!");
	}
	
	@GetMapping(value = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(value = "/channa")
	public String channaPage() {
		return "Hello Channa, How are you today?";
	}

}
