package com.web.hadir.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${username}")
	private String userName;
	
	@Value("${password}")
	private String password;
	
	public String getBrowser() {
		return browser;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
}
