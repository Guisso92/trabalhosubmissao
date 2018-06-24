package br.edu.ulbra.submissoes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class UserController {
	
	@GetMapping("/cadastrar")
	public String novo() {
		return "/usuarios/novo";
	}

}
