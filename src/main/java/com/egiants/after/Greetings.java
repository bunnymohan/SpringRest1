package com.egiants.after;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Greetings {

	@RequestMapping("/greeting for the day")
	 public @ResponseBody String greeting(){
		return "Hello Team Greeting for the day";
	}
}
