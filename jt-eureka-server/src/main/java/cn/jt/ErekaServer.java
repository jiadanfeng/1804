package cn.jt;


import org.springframework.boot.SpringApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication	
@EnableEurekaServer
public class ErekaServer {
	public static void main(String[] args) {
		
		SpringApplication.run(ErekaServer.class, args);
	}
}
