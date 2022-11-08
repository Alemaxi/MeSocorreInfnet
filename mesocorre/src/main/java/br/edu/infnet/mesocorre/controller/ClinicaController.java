package br.edu.infnet.mesocorre.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.mesocorre.model.domain.Clinica;
import br.edu.infnet.mesocorre.model.domain.Plano;

@Controller
public class ClinicaController {
	
	private static Map<Integer,Clinica> mapa = new HashMap<Integer,Clinica>();
	
	private static int id = 0;
	
	public static void AddClinica(Clinica clinica) {
		clinica.setId(++id);
		
		mapa.put(id, clinica);
	}
	
	public static Collection<Clinica> GetCollection(){
		return mapa.values();
	}
	
	public static void ExcluirUm(Integer id) {
		mapa.remove(id);
	}
	
	@GetMapping(value = "/clinica/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("Listagem", GetCollection());
		
		return "clinica/lista";
	}
	
	@GetMapping(value = "/clinica/{id}/excluir")
	public String Excluir(@PathVariable Integer id )
	{
		ExcluirUm(id);
		return "redirect:/clinica/lista";
	}

}
