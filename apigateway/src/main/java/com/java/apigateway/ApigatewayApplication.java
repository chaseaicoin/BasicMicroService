package com.java.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigatewayApplication.class, args);
	}


	//Feature to avail:
	/*
		Security — Authentication, authorization
		Routing — routing, request/response manipulation, circuit breaker
		Observability — metric aggregation, logging, tracing

		Architectural benefits of API Gateway:
		Reduced complexity
		Centralized control of policies
		Simplified troubleshooting

		Ways to integrate Api gateway
		Spring Cloud Gateway,
		Zuul API Gateway,
		APIGee,
		EAG (Enterprise API Gateway)

	 */



}
