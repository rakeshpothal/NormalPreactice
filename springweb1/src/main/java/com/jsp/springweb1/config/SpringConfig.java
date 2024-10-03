package com.jsp.springweb1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jsp.springweb1")
public class SpringConfig {

	public SpringConfig() {
		System.out.println(this.getClass().getSimpleName());
	}

}
