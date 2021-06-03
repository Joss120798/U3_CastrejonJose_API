package mx.edu.utez.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.api.entity.PersonaEntity;
import mx.edu.utez.api.repository.PersonaRepository;
import mx.edu.utez.api.service.PersonaService;


@RestController
@RequestMapping("/app")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class PersonaController {

	@Autowired
	PersonaRepository personaRepository;
	@Autowired
	PersonaService personaService;
	
	
	@GetMapping("/lista/index")
	public List<PersonaEntity> index() {
		return personaService.getAll();
	}

	 
	@PostMapping("/persona/save")
	public String save(@RequestBody PersonaEntity personaEntity) {
		System.out.print("Entre: "+ personaEntity.getNombre());
		
		try {
			personaService.save(personaEntity);
			return "se registro";
		} catch (Exception e) {
			return "ocurrio un error";
		}
		
	}
	
	@GetMapping("/persona/one/{id}")

	public PersonaEntity get(@PathVariable long id) {
		return personaService.get(id);
		
	}
	

	@PostMapping("/persona/update")
	public String update(@RequestBody PersonaEntity personaEntity) {		
		try {
			personaService.save(personaEntity);
			return "se actualizo";
		} catch (Exception e) {
			return "ocurrio un error";
		}
		
	}

	@GetMapping("/persona/delete/{id}")
	public String delete(@PathVariable long id) {
		try {
			System.out.print(id);
			personaService.delete(id);
			return "Se elimino";
		} catch (Exception e) {
			return "ocurrio un error";
		}
		
	}


}
