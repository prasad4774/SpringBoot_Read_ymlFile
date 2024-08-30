package com.jrtp3.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController {

	@Autowired
	private AppProperty appProperties;
	
	@GetMapping("/welcome")
	public String welcomePage()
	{
		Map<String, String> message = appProperties.getMessage();

		String string = message.get(AppContant.WELCOME_MSG_KEY);
		return string;
		
	}
	
	
	@GetMapping("/greet")
	public String greetPage()
	{

		String string = appProperties.getMessage().get(AppContant.GREET_MSG_KEY);

		return string;
	}
}
