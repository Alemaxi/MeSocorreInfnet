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
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.mesocorre.model.domain.Laboratorio;
import br.edu.infnet.mesocorre.model.service.LaboratorioService;
import br.edu.infnet.mesocorre.model.service.PlanoService;

@Controller
public class LaboratorioController {
	
	@Autowired
	private LaboratorioService laboratorioService;
	
	@Autowired
	private PlanoService planoService;
	
	@GetMapping(value = "/laboratorio/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", laboratorioService.GetCollection());
		
		return "laboratorio/lista";
	}
	
	@GetMapping(value = "/laboratorio/incluir")
	public String Incluir(Model model)
	{
		model.addAttribute("planos", planoService.GetCollection());
		return "/laboratorio/cadastro";
	}
	
	@PostMapping(value = "/laboratorio/incluir")
	public String Incluir(Laboratorio laboratorio)
	{
		laboratorioService.AddLab(laboratorio);
		return "redirect:/laboratorio/lista";
	}
	
	@GetMapping(value = "/laboratorio/{id}/excluir")
	public String Excluir(@PathVariable Integer id )
	{
		laboratorioService.ExcluirUm(id);
		return "redirect:/laboratorio/lista";
	}

}
