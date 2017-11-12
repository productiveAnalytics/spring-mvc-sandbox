package com.productiveAnalytics.spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@GetMapping(path="/login")
	@ResponseBody
	public String sayHello() {
		return "Hello World";
	}
	
	@RequestMapping(path = "/hello", method=RequestMethod.GET)
    public String sayHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "hello";	// Uses ViewResolver to resolve to hello.jsp, not raw string.
    }

}
