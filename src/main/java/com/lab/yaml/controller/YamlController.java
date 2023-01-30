package com.lab.yaml.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.lab.yaml.service.YamlLoadExample;

@RestController
public class YamlController {
	
	@Autowired
	YamlLoadExample load;

	@GetMapping("/yaml3")
	public String yaml3() throws FileNotFoundException {
		return load.print();
	}
	
	@GetMapping("/yaml4")
	public String yaml4() throws StreamReadException, DatabindException, IOException {
		return load.print2();
	}
}
