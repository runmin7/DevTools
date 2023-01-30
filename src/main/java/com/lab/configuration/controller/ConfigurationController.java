package com.lab.configuration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab.configuration.pojo.Configuration;

@RestController
public class ConfigurationController {

	@Value("${document.type.html.TS}")
	private String ts;
	
	@Autowired
	Configuration config;
	
	//@ConfigurationProperties Example
	@GetMapping("/config")
	public String config() {
		return config.toString();
	}
	
	//특정 프로퍼티를 지정해 조회하는 예제
	@GetMapping("/value")
	public String value() {
		return this.ts;
	}
	
}
