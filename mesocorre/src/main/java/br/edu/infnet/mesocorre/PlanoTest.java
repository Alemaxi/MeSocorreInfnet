package br.edu.infnet.mesocorre;

import java.time.temporal.TemporalUnit;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.mesocorre.controller.PlanoController;
import br.edu.infnet.mesocorre.model.domain.Clinica;
import br.edu.infnet.mesocorre.model.domain.Hospital;
import br.edu.infnet.mesocorre.model.domain.Laboratorio;
import br.edu.infnet.mesocorre.model.domain.Plano;
import br.edu.infnet.mesocorre.model.domain.Rede;
import br.edu.infnet.mesocorre.model.domain.UnidadeSaude;
import br.edu.infnet.mesocorre.model.domain.Usuario;
import br.edu.infnet.mesocorre.model.service.PlanoService;

@Order(1)
@Component
public class PlanoTest implements ApplicationRunner{
	
	@Autowired
	private PlanoService planoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		// TODO Auto-generated method stub
		Plano p1 = new Plano();
		p1.setAcomodacao("Quarto");
		p1.setNome("plano 1");
		p1.setIdRede(1);
		p1.setIdUsuario(1);
		
		Plano p2 = new Plano();
		p1.setAcomodacao("enfermaria");
		p1.setNome("plano 2");
		p1.setIdRede(1);
		p1.setIdUsuario(1);
		
		Plano p3 = new Plano();
		p1.setAcomodacao("Quarto");
		p1.setNome("plano 2");
		p1.setIdRede(1);
		p1.setIdUsuario(1);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		planoService.Add(p1);
		planoService.Add(p2);
		planoService.Add(p3);
	}
}
