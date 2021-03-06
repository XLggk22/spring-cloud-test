package com.my.test.spring.springcloudconsumerribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * <p>Title: HelloService</p>
 * <p>Description: </p>
 *
 * @author Administrator
 * @version 1.0
 * @date 2020/5/27 12:50
 */
@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;

	//断路器策略
	@HystrixCommand(fallbackMethod = "hiError")
	public String hiService(String name){
		return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
	}

	public String hiError(String name) {
		return "hi,"+name+",sorry,error!";
	}
}
