package br.edu.infnet.mesocorre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import br.edu.infnet.mesocorre.model.service.HospitalService;

@Controller
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	@GetMapping(value = "/hospital/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", hospitalService.GetCollection());
		
		return "hospital/lista";
	}
	
	@GetMapping(value = "/hospital/{id}/excluir")
	public String Excluir(@PathVariable Integer id )
	{
		hospitalService.ExcluirUm(id);
		return "redirect:/hospital/lista";
	}

}
