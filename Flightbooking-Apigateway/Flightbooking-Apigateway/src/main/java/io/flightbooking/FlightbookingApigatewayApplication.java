package io.flightbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.CrossOrigin;

@EnableEurekaClient
@SpringBootApplication
@CrossOrigin(origins= "http://localhost:4200")
public class FlightbookingApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightbookingApigatewayApplication.class, args);
	}

}
