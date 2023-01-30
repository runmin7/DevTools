package com.lab.index.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lab.yaml.pojo.Greeting;

@RestController
public class IndexController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping("/index")
	public String index() {
		return "<a href='value'>value</a><br>"
				+ "<a href='yaml3'>yaml3</a><br>"
				+ "<a href='yaml4'>yaml4</a><br>"
				+ "<a href='config'>config</a><br>"
				+ "<a href='greeting'>greeting</a><br>"
				;
	}
	
}
