package br.edu.infnet.mesocorre;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.mesocorre.controller.ClinicaController;
import br.edu.infnet.mesocorre.model.domain.Clinica;
import br.edu.infnet.mesocorre.model.domain.Plano;
import br.edu.infnet.mesocorre.model.domain.Usuario;
import br.edu.infnet.mesocorre.model.service.ClinicaService;
import br.edu.infnet.mesocorre.model.service.PlanoService;
import br.edu.infnet.mesocorre.model.service.UsuarioService;

@Order(0)
@Component
public class UsuarioTest implements ApplicationRunner {

	@Autowired
	private PlanoService planoService;
	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Clinica");
		
		// TODO Auto-generated method stub
		Usuario u1 = new Usuario();
		u1.setEmail("email1");
		u1.setNome("nome1");
		u1.setSenha("senha1");
		System.out.println(u1);
		
		Usuario u2 = new Usuario();
		u2.setEmail("email2");
		u2.setNome("nome2");
		u2.setSenha("senha2");
		System.out.println(u2);
		
		
		Usuario u3 = new Usuario();
		u3.setEmail("email3");
		u3.setNome("nome3");
		u3.setSenha("senha3");
		System.out.println(u3);
		
		
		usuarioService.Add(u1);
		usuarioService.Add(u2);
		usuarioService.Add(u3);

	}
	

}
