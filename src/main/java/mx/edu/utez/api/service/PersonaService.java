package mx.edu.utez.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.api.entity.PersonaEntity;
import mx.edu.utez.api.repository.PersonaRepository;

@Service
@Transactional
public class PersonaService {
	@Autowired
	private PersonaRepository personaRepository;
	
	public List<PersonaEntity> getAll() {
		return personaRepository.findAll();
	}

	public void save(PersonaEntity personaEntity) {
		personaRepository.save(personaEntity);
	}

	public void update(PersonaEntity personaEntity) {
		personaRepository.save(personaEntity);
	}

	public PersonaEntity get(long id) {
		return personaRepository.findById(id).get();
	}
	

	public void delete(long id) {
		personaRepository.deleteById(id);
	}

}
