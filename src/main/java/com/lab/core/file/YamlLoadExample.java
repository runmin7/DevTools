package com.lab.core.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.Yaml;

@Component
public class YamlLoadExample {

	public String print() throws FileNotFoundException {
		Map<String, Object> map = new Yaml().load(new FileReader("src/main/resources/sam.yaml"));
		return map.toString();
	}
	
}
