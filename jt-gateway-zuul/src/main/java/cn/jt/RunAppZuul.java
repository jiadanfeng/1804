package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringCloudApplication	
@EnableFeignClients
@EnableZuulProxy //api网管
public class RunAppZuul {
	public static void main(String[] args) {
		SpringApplication.run(RunAppZuul.class, args);
	}
}