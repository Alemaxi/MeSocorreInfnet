package br.edu.infnet.mesocorre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.mesocorre.model.service.ClinicaService;

@Controller
public class ClinicaController {
	
	@Autowired
	private ClinicaService clinicaService;
	
	@GetMapping(value = "/clinica/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("Listagem", clinicaService.GetCollection());
		
		return "clinica/lista";
	}
	
	@GetMapping(value = "/clinica/{id}/excluir")
	public String Excluir(@PathVariable Integer id )
	{
		clinicaService.ExcluirUm(id);
		return "redirect:/clinica/lista";
	}

}
