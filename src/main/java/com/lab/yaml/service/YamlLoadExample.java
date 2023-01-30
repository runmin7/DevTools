package com.lab.yaml.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.lab.yaml.pojo.Order;

@Component
public class YamlLoadExample {

	public String print() throws FileNotFoundException {
		Map<String, Object> map = new Yaml().load(new FileReader("src/main/resources/sam.yaml"));
		return map.toString();
	}
	
	//이걸 이용하면.. 객체로 받아올 수 있네
	//https://www.baeldung.com/jackson-yaml
	public String print2() throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		mapper.findAndRegisterModules();
		Order order = mapper.readValue(new File("src/main/resources/orderInput.yaml"), Order.class);	

		System.out.println(order);
		
		return "";
	}
	
}
