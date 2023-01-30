package com.lab.core.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.Greeting;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

@RestController
public class Hello {
	
	@Value("${document.type.html.TS}")
	private String ts;
	
	@Autowired
	ApplicationConfig config;
	
	@Autowired
	YamlLoadExample load;

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
	
	@GetMapping("/yaml")
	public String yaml() {
		return this.ts;
	}
	
	@GetMapping("/yaml2")
	public String yaml2() {
		return config.toString();
	}

	@GetMapping("/yaml3")
	public String yaml3() throws FileNotFoundException {
		return load.print();
	}
	
	@GetMapping("/yaml4")
	public String yaml4() throws StreamReadException, DatabindException, IOException {
		return load.print2();
	}
}
