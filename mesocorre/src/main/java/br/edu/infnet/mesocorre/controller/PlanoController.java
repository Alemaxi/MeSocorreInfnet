package br.edu.infnet.mesocorre.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.mesocorre.model.domain.Plano;
import br.edu.infnet.mesocorre.model.service.PlanoService;

@Controller
public class PlanoController {
	
	@Autowired
	private PlanoService planoService;
	
	@GetMapping(value = "/plano/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", planoService.GetCollection());
		return "plano/lista";
	}
	
	@GetMapping(value = "/plano/{id}/excluir")
	public String Excluir(@PathVariable Integer id )
	{
		planoService.ExcluirUm(id);
		return "redirect:/plano/lista";
	}

}
