package com.otsi.retail.serviceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaSrviceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSrviceRegistryApplication.class, args);
	}

}
