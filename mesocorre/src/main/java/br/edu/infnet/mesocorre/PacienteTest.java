package br.edu.infnet.mesocorre;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.mesocorre.model.domain.Paciente;

@Component
public class PacienteTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		Paciente p1 = new Paciente();
		p1.id = 1;
		p1.idade=1;
		p1.nome="nome1";
		System.out.println(p1);
		
		Paciente p2 = new Paciente();
		p2.id = 2;
		p2.idade=2;
		p2.nome="nome2";
		System.out.println(p2);
		
		Paciente p3 = new Paciente();
		p3.id = 3;
		p3.idade=3;
		p3.nome="nome3";
		System.out.println(p3);
	}
}
