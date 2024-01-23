package com.bbt.core.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yingbiao.fan@hand-china.com
 * @version 1.0
 * @date 2024/1/23 15:56
 */
@RestController
@RequestMapping("/api")
public class HelloController {

	@GetMapping("/h")
	public String hello(){
		return "helloWorld!";
	}
}
