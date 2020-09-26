package com.my.test.spring.springcloudconsumerribbon.controller;

import com.my.test.spring.springcloudconsumerribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: HelloControler</p>
 * <p>Description: </p>
 *
 * @author Administrator
 * @version 1.0
 * @date 2020/5/27 12:52
 */
@RestController
public class HelloControler {

	@Autowired
	HelloService	helloService;

	@GetMapping(value = "/hi")
	public String hi(String name){
		return  helloService.hiService(name);
	}
}
