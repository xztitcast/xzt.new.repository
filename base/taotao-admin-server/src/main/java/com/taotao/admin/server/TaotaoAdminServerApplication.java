package com.taotao.admin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class TaotaoAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaotaoAdminServerApplication.class, args);
	}

}
