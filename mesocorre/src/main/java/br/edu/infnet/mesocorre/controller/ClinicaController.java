package br.edu.infnet.mesocorre.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.mesocorre.model.domain.Clinica;

@Controller
public class ClinicaController {
	
	@GetMapping(value = "/clinica/lista")
	public String telaLista(Model model) {
		
		Clinica c1 = new Clinica();
		c1.setEndereco("end1");
		c1.especialidades = new ArrayList<String>();
		c1.especialidades.add("esp1");
		c1.horaAbertura = 8;
		c1.horaFechamento = 22;
		c1.setId(1);
		c1.setNome("Clinica1");
		
		
		Clinica c2 = new Clinica();
		c2.setNome("end2");
		c2.especialidades = new ArrayList<String>();
		c2.especialidades.add("esp2");
		c2.horaAbertura = 8;
		c2.horaFechamento = 22;
		c2.setId(2);
		c2.setNome("Clinica2");
		
		
		Clinica c3 = new Clinica();
		c3.setEndereco("end3");
		c3.especialidades = new ArrayList<String>();
		c3.especialidades.add("esp3");
		c3.horaAbertura = 8;
		c3.horaFechamento = 22;
		c3.setId(1);
		c3.setNome("Clinica3");
		
		ArrayList<Clinica> clinicas = new ArrayList<Clinica>();
		clinicas.add(c1);
		clinicas.add(c2);
		clinicas.add(c3);
		
		model.addAttribute("Listagem", clinicas);
		
		return "clinica/lista";
	}

}
