package com.ecom.e_commerce_cloud_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ECommerceCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceCloudConfigServerApplication.class, args);
	}

}
