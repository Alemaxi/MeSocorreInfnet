package br.edu.infnet.mesocorre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.mesocorre.model.domain.Usuario;
import br.edu.infnet.mesocorre.model.service.ClinicaService;
import br.edu.infnet.mesocorre.model.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping(value = "/usuario/lista")
	public String GetLista(Model model) {
		
		model.addAttribute("listagem", service.GetCollection());
		
		return "usuario/lista";
	}
	
	@GetMapping(value = "/usuario/{id}/excluir")
	public String Excluir(@PathVariable Integer id )
	{
		service.ExcluirUm(id);
		return "redirect:/clinica/lista";
	}
	
	@GetMapping(value = "/usuario/cadastro")
	public String cadastro()
	{
		return "/usuario/cadastro";
	}


	@PostMapping(value = "/usuario/incluir")
	public String Incluir(Usuario usuario )
	{
		service.Add(usuario);
		return "redirect:/clinica/lista";
	}
}
