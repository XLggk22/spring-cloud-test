package com.my.test.spring.springcloudconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerFeignApplication.class, args);
	}

}
