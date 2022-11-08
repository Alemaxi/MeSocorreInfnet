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

import br.edu.infnet.mesocorre.model.domain.Rede;

@Controller
public class RedeController {
	
	private static Map<Integer,Rede> mapa = new HashMap<Integer,Rede>();
	
	private static int id = 0;
	
	public static void AddRede(Rede rede) {
		rede.setId(++id);
		
		mapa.put(id, rede);
	}
	
	public static void ExcluirUm(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Rede> GetCollection(){
		return mapa.values();
	}
	
	@GetMapping(value = "/rede/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem",GetCollection());
		return "rede/lista";
	}
	
	@GetMapping(value = "/rede/{id}/excluir")
	public String Excluir(@PathVariable Integer id )
	{
		ExcluirUm(id);
		return "redirect:/rede/lista";
	}

}
