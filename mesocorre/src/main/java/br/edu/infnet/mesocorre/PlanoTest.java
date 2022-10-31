package br.edu.infnet.mesocorre;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.mesocorre.model.domain.Plano;

@Component
public class PlanoTest implements ApplicationRunner{
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Plano");
		
		// TODO Auto-generated method stub
		Plano p1 = new Plano(1,"plano 1", "endereco 1");
		Plano p2 = new Plano(2,"plano 2", "endereco 2");
		Plano p3 = new Plano(3,"plano 3", "endereco 3");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
