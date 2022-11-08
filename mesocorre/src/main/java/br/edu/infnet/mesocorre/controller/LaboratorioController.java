package br.edu.infnet.mesocorre.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.mesocorre.model.domain.Laboratorio;

@Controller
public class LaboratorioController {
	
	private static Map<Integer,Laboratorio> labs = new HashMap<Integer,Laboratorio>();
	
	private static int id = 0;
	
	public static void AddLab(Laboratorio lab) {
		lab.setId(++id);
		
		labs.put(lab.getId(), lab);
	}
	
	public static Collection<Laboratorio> GetCollection(){
		return labs.values();
	}
	
	public static void ExcluirUm(Integer id) {
		labs.remove(id);
	}
	
	@GetMapping(value = "/laboratorio/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", GetCollection());
		
		return "laboratorio/lista";
	}
	
	@GetMapping(value = "/laboratorio/{id}/excluir")
	public String Excluir(@PathVariable Integer id )
	{
		ExcluirUm(id);
		return "redirect:/laboratorio/lista";
	}

}
