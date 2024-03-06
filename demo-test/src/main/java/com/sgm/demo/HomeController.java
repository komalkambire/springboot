package com.sgm.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
@RequestMapping("home")

public String home() {
	
	System.out.println("home controller called -here we change the return string -exclude.");
	return "home";
}



}
