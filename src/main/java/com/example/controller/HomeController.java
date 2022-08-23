package com.example.controller;

import com.example.DataSourceConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${environment}")
	private String environment;
	
	@Autowired
	private DataSourceConfig dataSourceConfig;
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("environment", environment);
		dataSourceConfig.setup();
		model.addAttribute("datasource", dataSourceConfig.getConnection());
		return model.toString();
	}
}
