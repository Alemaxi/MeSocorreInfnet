package br.edu.infnet.mesocorre;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.mesocorre.model.domain.Hospital;

@Component
public class HospitalTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		Hospital h1 = new Hospital();
		h1.nome = "nome1";
		h1.endereco = "end1";
		h1.id = 1;
		System.out.println(h1);
		
		
		Hospital h2 = new Hospital();
		h2.nome = "nome2";
		h2.endereco = "end2";
		h2.id = 2;
		System.out.println(h2);
		
		
		Hospital h3 = new Hospital();
		h3.nome = "nome3";
		h3.endereco = "end3";
		h3.id = 3;
		System.out.println(h3);
	}

}
