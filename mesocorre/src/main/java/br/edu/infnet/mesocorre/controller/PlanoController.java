package br.edu.infnet.mesocorre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlanoController {
	
	@GetMapping(value = "/plano/lista")
	public String telaLista() {
		return "plano/lista";
	}

}