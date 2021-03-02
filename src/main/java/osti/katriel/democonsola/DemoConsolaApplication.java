package osti.katriel.democonsola;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import osti.katriel.democonsola.service.IPersonaService;

@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner {

	@Autowired
	private IPersonaService personaService;
	
	public static void main(String[] args) {
		
		SpringApplication.run(DemoConsolaApplication.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {

		personaService.registrar("Osti Katriel!");

	}

}
