package br.edu.infnet.mesocorre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.mesocorre.model.service.RedeService;

@Controller
public class RedeController {
	
	@Autowired
	private RedeService redeService;
	
	@GetMapping(value = "/rede/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", redeService.GetCollection());
		return "rede/lista";
	}
	
	@GetMapping(value = "/rede/{id}/excluir")
	public String Excluir(@PathVariable Integer id )
	{
		redeService.ExcluirUm(id);
		return "redirect:/rede/lista";
	}

}
