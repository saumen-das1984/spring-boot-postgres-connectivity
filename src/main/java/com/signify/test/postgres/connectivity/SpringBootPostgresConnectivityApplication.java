package com.signify.test.postgres.connectivity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.signify")
public class SpringBootPostgresConnectivityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPostgresConnectivityApplication.class, args);
	}

}
