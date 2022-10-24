package br.edu.infnet.mesocorre;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.mesocorre.model.domain.Upa;

@Component
public class UpaTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		Upa u1 = new Upa();
		u1.nome = "nome1";
		u1.id= 1;
		u1.endereco = "end1";
		System.out.println(u1);
		
		Upa u2 = new Upa();
		u2.nome = "nome2";
		u2.id= 2;
		u2.endereco = "end2";
		System.out.println(u2);
		
		Upa u3 = new Upa();
		u3.nome = "nome3";
		u3.id= 3;
		u3.endereco = "end3";
		System.out.println(u3);
	}

}
