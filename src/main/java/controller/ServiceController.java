package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	
	@RequestMapping("/")
	public String HelloWorld() {
		return "Hello from service1";
	}

}
