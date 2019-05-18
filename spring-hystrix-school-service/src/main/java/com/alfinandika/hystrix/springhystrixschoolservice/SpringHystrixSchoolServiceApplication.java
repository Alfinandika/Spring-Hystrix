package com.alfinandika.hystrix.springhystrixschoolservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@EnableCircuitBreaker
@SpringBootApplication
public class SpringHystrixSchoolServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHystrixSchoolServiceApplication.class, args);
	}

}
