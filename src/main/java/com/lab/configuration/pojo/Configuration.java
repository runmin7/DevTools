package com.lab.configuration.pojo;

import java.util.List;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/** 
 * @ConfigurationProperties
 * *.properties , *.yml 파일을 읽는다.
 * 카멜표기, 대소문자, 하이픈이 포함된 문자까지 자동으로 바인딩
 * 파일을 선택할수는 없지만, 접두어를 제한적으로 읽어들이도록 세팅 가능
 * SPEL 불가 
**/
@ConfigurationProperties
@ToString
@Component
public class Configuration {

	@Getter@Setter
	private String sample;
	
	@Getter@Setter
	private String test;
	
	@Getter@Setter
	private List<Set> listSample;
}
