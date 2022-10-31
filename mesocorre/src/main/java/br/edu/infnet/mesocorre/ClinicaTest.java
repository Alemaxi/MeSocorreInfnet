package br.edu.infnet.mesocorre;

import java.util.ArrayList;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.mesocorre.model.domain.Clinica;

@Component
public class ClinicaTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Clinica");
		
		// TODO Auto-generated method stub
		Clinica c1 = new Clinica();
		c1.setEndereco("end1");
		c1.especialidades = new ArrayList<String>();
		c1.especialidades.add("esp1");
		c1.horaAbertura = 8;
		c1.horaFechamento = 22;
		c1.setId(1);
		c1.setNome("Clinica1");
		System.out.println(c1);
		
		
		Clinica c2 = new Clinica();
		c2.setNome("end2");
		c2.especialidades = new ArrayList<String>();
		c2.especialidades.add("esp2");
		c2.horaAbertura = 8;
		c2.horaFechamento = 22;
		c2.setId(2);
		c2.setNome("Clinica2");
		System.out.println(c2);
		
		
		Clinica c3 = new Clinica();
		c3.setEndereco("end3");
		c3.especialidades = new ArrayList<String>();
		c3.especialidades.add("esp3");
		c3.horaAbertura = 8;
		c3.horaFechamento = 22;
		c3.setId(1);
		c3.setNome("Clinica3");
		System.out.println(c3);
	}
	

}
