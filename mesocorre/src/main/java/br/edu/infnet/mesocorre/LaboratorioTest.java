package br.edu.infnet.mesocorre;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.mesocorre.model.domain.Laboratorio;

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
		l1.horaAbertura = 9;
		l1.horaFechamento = 17;
		System.out.println(l1);
		
		Laboratorio l2 = new Laboratorio();
		l2.setId(2);
		l2.setNome("Laboratório 2");
		l2.setEndereco("endereco 2");
		l2.horaAbertura = 9;
		l2.horaFechamento = 17;
		System.out.println(l2);
		
		Laboratorio l3 = new Laboratorio();
		l3.setId(3);
		l3.setNome("Laboratório 3");
		l3.setNome("endereco 3");
		l3.horaAbertura = 9;
		l3.horaFechamento = 17;
		System.out.println(l3);
	}

}
