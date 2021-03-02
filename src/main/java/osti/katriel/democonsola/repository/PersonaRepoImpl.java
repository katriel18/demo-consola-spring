package osti.katriel.democonsola.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import osti.katriel.democonsola.DemoConsolaApplication;

@Repository
public class PersonaRepoImpl implements IPersonaRepo {

	private static Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);

	@Override
	public void registrar(String nombre) {
		
		LOG.info("Se registro a " + nombre);
		
	}
	
}
