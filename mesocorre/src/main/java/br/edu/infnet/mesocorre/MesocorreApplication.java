package br.edu.infnet.mesocorre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MesocorreApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(MesocorreApplication.class, args);
	}

}
