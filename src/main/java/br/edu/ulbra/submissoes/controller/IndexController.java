package br.edu.ulbra.submissoes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "/index.html";
	}
	
	@GetMapping("/login")
	public ModelAndView loginForm(){
		return new ModelAndView("login/login");
	}

}
