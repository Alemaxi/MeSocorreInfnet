package br.edu.infnet.mesocorre;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.mesocorre.controller.LaboratorioController;
import br.edu.infnet.mesocorre.model.domain.Laboratorio;
import br.edu.infnet.mesocorre.model.domain.Plano;

@Component
public class LaboratorioTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Laboratório");
		
		// TODO Auto-generated method stub
		Laboratorio l1 = new Laboratorio();
		l1.setId(1);
		l1.setNome("Laboratório 1");
		l1.setEndereco("endereco 1");
		l1.setHoraAbertura(9);
		l1.setHoraFechamento(17);
		System.out.println(l1);
		
		Laboratorio l2 = new Laboratorio();
		l2.setId(2);
		l2.setNome("Laboratório 2");
		l2.setEndereco("endereco 2");
		l1.setHoraAbertura(9);
		l1.setHoraFechamento(17);
		System.out.println(l2);
		
		Laboratorio l3 = new Laboratorio();
		l3.setId(3);
		l3.setNome("Laboratório 3");
		l3.setNome("endereco 3");
		l1.setHoraAbertura(9);
		l1.setHoraFechamento(17);	
		System.out.println(l3);
		
		LaboratorioController.AddLab(l1);
		LaboratorioController.AddLab(l2);
		LaboratorioController.AddLab(l3);
	}

}
