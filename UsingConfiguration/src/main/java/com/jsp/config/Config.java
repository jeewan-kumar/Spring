package com.jsp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

import com.jsp.model.PanCard;


@Configuration
@ComponentScan(basePackages = "com.jsp")
public class Config {
	@Bean
	public PanCard crPanCard() {
		return new PanCard();
	}
}
