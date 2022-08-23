package com.example;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProductionDataSourceConfig implements DataSourceConfig {

	@Override
	public void setup() {
		System.out.println("This is setup for Production Environment");
		
	}

	@Override
	public String getConnection() {
		return "Production data source";
	}
	
}
