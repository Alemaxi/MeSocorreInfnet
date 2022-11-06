package br.edu.infnet.mesocorre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedeController {
	
	@GetMapping(value = "/rede/lista")
	public String telaLista() {
		return "rede/lista";
	}

}
