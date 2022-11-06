package br.edu.infnet.mesocorre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HospitalController {
	
	@GetMapping(value = "/hospital/lista")
	public String telaLista() {
		return "hospital/lista";
	}

}
