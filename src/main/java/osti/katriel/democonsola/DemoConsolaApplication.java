package osti.katriel.democonsola;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import osti.katriel.democonsola.service.IPersonaService;

@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner {

	private static Logger LOG=LoggerFactory.getLogger(DemoConsolaApplication.class);

	@Autowired
	private IPersonaService personaService;
	
	public static void main(String[] args) {
		
		SpringApplication.run(DemoConsolaApplication.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		/*
		LOG.info("Test Katriel!");
		LOG.error("Test Katriel!");
		LOG.warn("Test Katriel!");
		*/
		
		//personaService=new PersonaServiceImpl();
		personaService.registrar("Osti Katriel!");

	}

}
