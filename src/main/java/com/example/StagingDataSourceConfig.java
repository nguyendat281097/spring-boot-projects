package com.example;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("staging")
public class StagingDataSourceConfig implements DataSourceConfig {

	@Override
	public void setup() {
		System.out.println("This is setup for Staging Environment");
		
	}

	@Override
	public String getConnection() {
		return "Staging data source";
	}
	
}
