package br.edu.infnet.mesocorre;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.mesocorre.controller.ClinicaController;
import br.edu.infnet.mesocorre.model.domain.Clinica;
import br.edu.infnet.mesocorre.model.service.ClinicaService;


@Component
public class ClinicaTest implements ApplicationRunner {

	@Autowired
	private ClinicaService clinicaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Clinica");
		
		// TODO Auto-generated method stub
		Clinica c1 = new Clinica();
		c1.setEndereco("end1");
		//c1.setEspecialidades(new ArrayList<String>());
		//c1.getEspecialidades().add("esp2");
		c1.setAbertura(8);
		c1.setFechamento(22);
		c1.setId(1);
		c1.setNome("Clinica1");
		System.out.println(c1);
		
		Clinica c2 = new Clinica();
		c2.setNome("end2");
		//c2.setEspecialidades(new ArrayList<String>());
		//c2.getEspecialidades().add("esp2");
		c2.setAbertura(8);
		c2.setFechamento(22);
		c2.setId(2);
		c2.setNome("Clinica2");
		System.out.println(c2);
		
		
		Clinica c3 = new Clinica();
		c3.setEndereco("end3");
		//c3.setEspecialidades(new ArrayList<String>());
		//c3.getEspecialidades().add("esp2");
		c3.setAbertura(8);
		c3.setFechamento(22);
		c3.setId(1);
		c3.setNome("Clinica3");
		System.out.println(c3);
		
		
		clinicaService.AddClinica(c1);
		clinicaService.AddClinica(c2);
		clinicaService.AddClinica(c3);
	}
	

}
