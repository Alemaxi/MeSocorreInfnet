package br.edu.infnet.mesocorre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.mesocorre.model.domain.Rede;
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
	
	@GetMapping(value = "/rede/incluir")
	public String incluir() {
		return "/rede/cadastro";
	}
	
	@PostMapping(value = "/rede/incluir")
	public String incluir(Rede rede) {
		redeService.Add(rede);
		return "redirect:/rede/lista";
	}
	
	@GetMapping(value = "/rede/{id}/excluir")
	public String Excluir(@PathVariable Integer id )
	{
		redeService.ExcluirUm(id);
		return "redirect:/rede/lista";
	}

}
