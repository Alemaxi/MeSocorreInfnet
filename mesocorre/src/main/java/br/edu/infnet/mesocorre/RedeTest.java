package br.edu.infnet.mesocorre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.mesocorre.model.domain.Rede;
import br.edu.infnet.mesocorre.model.service.RedeService;


@Component
public class RedeTest implements ApplicationRunner {

	@Autowired
	private RedeService redeService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Rede");
		
		// TODO Auto-generated method stub
		Rede r1 = new Rede(0,"Rede 1", "202020");
		System.out.println(r1);
		
		Rede r2 = new Rede(1,"Rede 1", "202020");
		System.out.println(r2);
		
		Rede r3 = new Rede(2,"Rede 1", "202020");
		System.out.println(r3);
		
		redeService.Add(r1);
		redeService.Add(r2);
		redeService.Add(r3);
	}

}
