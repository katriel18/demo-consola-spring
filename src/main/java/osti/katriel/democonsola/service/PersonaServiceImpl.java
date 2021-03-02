package osti.katriel.democonsola.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import osti.katriel.democonsola.repository.IPersonaRepo;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaRepo repo;

	public void registrar(String nombre) {
		
		//repo=new PersonaRepoImpl();
		repo.registrar(nombre);
		
	}

}
