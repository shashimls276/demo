/**
 * 
 */
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ab68478
 *
 */
@RestController
public class Controller {
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World CI/CD -- GitHub-Webhook implemented successfully";
	}
}
