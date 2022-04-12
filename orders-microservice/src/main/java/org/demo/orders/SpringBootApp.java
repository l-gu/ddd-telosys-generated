package org.demo.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class SpringBootApp {

	/**
	 * Entry point for spring-boot based app
	 *
	 * @param args
	 *            - arguments
	 */
	public static void main(String[] args) {
		System.out.println("SpringBootApp *****");

		SpringApplication.run(SpringBootApp.class, args);
	}

}
