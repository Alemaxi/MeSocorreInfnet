package br.edu.infnet.mesocorre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LaboratorioController {
	
	@GetMapping(value = "/laboratorio/lista")
	public String telaLista() {
		return "laboratorio/lista";
	}

}
