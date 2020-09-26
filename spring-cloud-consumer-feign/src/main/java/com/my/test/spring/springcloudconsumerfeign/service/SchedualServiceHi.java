package com.my.test.spring.springcloudconsumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>Title: SchedualServiceHi</p>
 * <p>Description: </p>
 *
 * @author Administrator
 * @version 1.0
 * @date 2020/5/27 15:04
 */
//@FeignClient来指定调用哪个服务
@FeignClient(value = "service-hi")
public interface SchedualServiceHi {

	//@RequestMapping用来指定调用哪个接口
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
