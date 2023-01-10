package com.lab.core.file;

import java.util.List;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Component
@ConfigurationProperties()
public class ApplicationConfig {

	@Getter@Setter
	private String sample;
	
	@Getter@Setter
	private String test;
	
	@Getter@Setter
	private List<Set> listSample;
}
