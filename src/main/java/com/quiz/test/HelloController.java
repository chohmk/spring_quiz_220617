package com.quiz.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	// http://localhost:8080/test2
	@ResponseBody
	@RequestMapping("/test2")
	public String test2() {
		return "Hello World!!";
	}
}
