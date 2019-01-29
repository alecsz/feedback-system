package org.asck.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController extends AbstractController {

	@GetMapping("/error")
	public String error(Model model) {
		return "error";
	}

	// @GetMapping("/throwError")
//	public String throwError() {
//		throw new ExampleException(); 
//	}
}