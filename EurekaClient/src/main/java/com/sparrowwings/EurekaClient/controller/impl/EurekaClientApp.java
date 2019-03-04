package com.sparrowwings.EurekaClient.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

import com.sparrowwings.EurekaClient.controllerInterfaces.EurekaClientController;

@SpringBootApplication
@RestController
public class EurekaClientApp implements EurekaClientController {
	
	/*The @Lazy Annotation is for Lazy loading .Lazy loading is a design 
	pattern commonly used in computer programming to defer initialization 
	of an object until the point at which it is needed.*/
	@Autowired
	@Lazy
	private EurekaClientApp eurekaClient;

	@Value("${spring.application.name}")
	private String appName;

	public static void main(String[] args) {
		
		SpringApplication.run(EurekaClientApp.class, args);
		System.out.println("*******************Eureka Client started***************");
	}

	public String greeting() {
		return String.format("Hello from '%s'!", appName);
	}

}
