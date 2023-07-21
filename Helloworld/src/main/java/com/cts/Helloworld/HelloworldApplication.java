package com.cts.Helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloworldApplication {


	@GetMapping(value = "/message")
	public String getmessage()
	{
		return "Hello world2!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);

	}

}
