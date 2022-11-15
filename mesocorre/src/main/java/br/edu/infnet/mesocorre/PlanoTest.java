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
		System.out.println("Plano");
		
		Usuario usuario = new Usuario();
		
		usuario.setId(0);
		
		Clinica c1 = new Clinica();
		c1.setEndereco("end1");
		//c1.setEspecialidades(new ArrayList<String>());
		//c1.getEspecialidades().add("esp2");
		c1.setAbertura(8);
		c1.setFechamento(22);
		c1.setId(1);
		c1.setNome("Clinica1");
		
		Hospital h1 = new Hospital();
		h1.setNome("nome1");
		h1.setEndereco("end1");
		h1.setId(1);
		h1.setEmergencia(true);
		h1.setInternacao(true);
		
		Laboratorio l1 = new Laboratorio();
		l1.setId(1);
		l1.setNome("Laboratório 1");
		l1.setEndereco("endereco 1");
		l1.setHoraAbertura(9);
		l1.setHoraFechamento(17);
		
		ArrayList<UnidadeSaude> tempUnidades = new ArrayList<UnidadeSaude>();
		tempUnidades.add(c1);
		tempUnidades.add(h1);
		tempUnidades.add(l1);
		
		
		Rede r1 = new Rede(0,"Rede 1", "202020");
		
		// TODO Auto-generated method stub
		Plano p1 = new Plano(1,"plano 1", "endereco 1",null,null);
		Plano p2 = new Plano(2,"plano 2", "endereco 2",null,null);
		Plano p3 = new Plano(3,"plano 3", "endereco 3",null,null);
		
		p1.setUsuario(usuario);
		p2.setUsuario(usuario);
		p3.setUsuario(usuario);
		
		//planoService.Add(p1);
		//planoService.Add(p2);
		//planoService.Add(p3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
