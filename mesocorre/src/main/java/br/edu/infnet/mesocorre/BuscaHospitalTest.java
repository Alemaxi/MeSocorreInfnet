package br.edu.infnet.mesocorre;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.mesocorre.model.domain.BuscaHospital;

@Component
public class BuscaHospitalTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Busca");
		
		// TODO Auto-generated method stub
		BuscaHospital busca1 = new BuscaHospital();
		busca1.enderecoBusca = "end1";
		busca1.idBusca = 1;
		busca1.nomeBusca = "nome1";
		System.out.println(busca1);
		
		BuscaHospital busca2 = new BuscaHospital();
		busca2.enderecoBusca = "end2";
		busca2.idBusca = 2;
		busca2.nomeBusca = "nome2";
		System.out.println(busca2);
		
		BuscaHospital busca3 = new BuscaHospital();
		busca3.enderecoBusca = "end3";
		busca3.idBusca = 3;
		busca3.nomeBusca = "nome3";
		System.out.println(busca3);
	}

}
