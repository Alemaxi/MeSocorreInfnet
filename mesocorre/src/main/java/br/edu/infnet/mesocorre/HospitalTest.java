package br.edu.infnet.mesocorre;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.mesocorre.controller.HospitalController;
import br.edu.infnet.mesocorre.model.domain.Hospital;

@Component
public class HospitalTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Hospital");
		
		// TODO Auto-generated method stub
		Hospital h1 = new Hospital();
		h1.setNome("nome1");
		h1.setEndereco("end1");
		h1.setId(1);
		h1.setEmergencia(true);
		h1.setInternacao(true);
		System.out.println(h1);
		
		
		Hospital h2 = new Hospital();
		h2.setNome("nome2");
		h2.setEndereco("end2");
		h2.setId(2);
		h2.setEmergencia(true);
		h2.setInternacao(true);
		System.out.println(h2);
		
		
		Hospital h3 = new Hospital();
		h3.setNome("nome3");
		h3.setEndereco("end3");
		h3.setId(3);
		h3.setEmergencia(true);
		h3.setInternacao(true);
		System.out.println(h3);
		
		HospitalController.AddHospital(h1);
		HospitalController.AddHospital(h2);
		HospitalController.AddHospital(h3);
	}

}
