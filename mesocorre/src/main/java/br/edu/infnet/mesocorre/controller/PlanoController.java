package br.edu.infnet.mesocorre.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.mesocorre.model.domain.Plano;
import br.edu.infnet.mesocorre.model.domain.Rede;
import br.edu.infnet.mesocorre.model.domain.Usuario;
import br.edu.infnet.mesocorre.model.service.PlanoService;
import br.edu.infnet.mesocorre.model.service.RedeService;
import br.edu.infnet.mesocorre.model.service.UsuarioService;

@Controller
public class PlanoController {

	@Autowired
	private PlanoService planoService;
	
	@Autowired
	private RedeService redeService;
	
	@Autowired
	private UsuarioService usuarioService;
	

	@GetMapping(value = "/plano/lista")
	public String telaLista(Model model, SessionStatus status, HttpSession session) {

		model.addAttribute("listagem", planoService.GetCollection());
		return "plano/lista";
	}
	
	@GetMapping(value = "/plano/incluir")
	public String incluir(Model model) {
		
		model.addAttribute("redes",redeService.GetCollection());
		
		model.addAttribute("usuarios",usuarioService.GetCollection());
		
		return "plano/cadastro";
	}
	
	@PostMapping(value = "/plano/incluir")
	public String incluirPost(Plano plano,SessionStatus status, HttpSession session) {
		
		if(status.isComplete()) {
			return "redirect:/plano/cadastro";
		}
		
		planoService.Add(plano);
		
		return "redirect:/plano/lista";
	}

	@GetMapping(value = "/plano/{id}/excluir")
	public String Excluir(@PathVariable Integer id) {
		planoService.ExcluirUm(id);
		return "redirect:/plano/lista";
	}

}
