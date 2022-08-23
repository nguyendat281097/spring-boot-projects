package com.example;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDataSourceConfig implements DataSourceConfig {

	@Override
	public void setup() {
		System.out.println("This is setup for Development Environment");
		
	}

	@Override
	public String getConnection() {
		return "Development data source";
	}
	
}
