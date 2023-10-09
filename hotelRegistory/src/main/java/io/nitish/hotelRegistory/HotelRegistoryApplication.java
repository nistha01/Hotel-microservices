package io.nitish.hotelRegistory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class HotelRegistoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelRegistoryApplication.class, args);
	}

}
