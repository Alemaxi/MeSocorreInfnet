package br.edu.infnet.mesocorre.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.mesocorre.model.domain.Usuario;
import br.edu.infnet.mesocorre.model.service.UsuarioService;

@SessionAttributes("user")
@Controller
public class AppController {
	
	@Autowired
	UsuarioService usuarioService;

	@GetMapping(value = "/")
	public String telaHome() {
		
		return "home";
	}
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String Login(Model model,@RequestParam String email, @RequestParam String senha) {
		
		Usuario usuario = usuarioService.Validar(email, senha);
		
		if(usuario != null) {
			model.addAttribute("user", usuario);
			return "home";
		}
		
		return "login";
	}
	
	@GetMapping(value = "/logout")
	public String telaLogout(HttpSession session, SessionStatus status) {
		
		status.setComplete();
		session.removeAttribute("user");
		
		return "redirect:/";
	}

}
