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

import br.edu.infnet.mesocorre.model.domain.Hospital;
import br.edu.infnet.mesocorre.model.domain.Plano;

@Controller
public class HospitalController {
	
	private static Map<Integer,Hospital> mapa = new HashMap<Integer,Hospital>();
	
	private static int id = 0;
	
	public static void AddHospital(Hospital hospital) {
		hospital.setId(id++);
		
		mapa.put(id, hospital);
	}
	
	public static Collection<Hospital> GetCollection(){
		return mapa.values();
	}
	
	public static void ExcluirUm(Integer id) {
		mapa.remove(id);
	}
	
	@GetMapping(value = "/hospital/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", GetCollection());
		
		return "hospital/lista";
	}
	
	@GetMapping(value = "/hospital/{id}/excluir")
	public String Excluir(@PathVariable Integer id )
	{
		ExcluirUm(id);
		return "redirect:/hospital/lista";
	}

}
