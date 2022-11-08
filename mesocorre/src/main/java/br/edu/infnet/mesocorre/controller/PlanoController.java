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

import br.edu.infnet.mesocorre.model.domain.Plano;

@Controller
public class PlanoController {
	
	private static Map<Integer,Plano> mapa = new HashMap<Integer,Plano>();
	
	private static int id = 0;
	
	public static void AddPlano(Plano plano) {
		plano.setId(++id);
		
		mapa.put(id, plano);
	}
	
	public static Collection<Plano> GetCollection(){
		return mapa.values();
	}
	
	public static void ExcluirUm(Integer id) {
		mapa.remove(id);
	}
	
	@GetMapping(value = "/plano/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", GetCollection());
		return "plano/lista";
	}
	
	@GetMapping(value = "/plano/{id}/excluir")
	public String Excluir(@PathVariable Integer id )
	{
		ExcluirUm(id);
		return "redirect:/plano/lista";
	}

}
