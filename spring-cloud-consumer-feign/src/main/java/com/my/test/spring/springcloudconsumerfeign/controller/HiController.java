package com.my.test.spring.springcloudconsumerfeign.controller;

import com.my.test.spring.springcloudconsumerfeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: HiController</p>
 * <p>Description: </p>
 *
 * @author Administrator
 * @version 1.0
 * @date 2020/5/27 15:05
 */
@RestController
public class HiController {

	@Autowired
	SchedualServiceHi schedualServiceHi;

	@GetMapping(value = "/hi")
	public String sayHi(@RequestParam String name){
		return schedualServiceHi.sayHiFromClientOne( name );
	}
}
