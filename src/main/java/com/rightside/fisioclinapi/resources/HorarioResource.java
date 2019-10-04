package com.rightside.fisioclinapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rightside.fisioclinapi.models.Horario;
import com.rightside.fisioclinapi.repository.HorarioRepository;

@RestController
@RequestMapping(value="/api")
public class HorarioResource {
	
	@Autowired
	HorarioRepository horarioRepository;
	
	@GetMapping("/horarios")
	public List<Horario> listaHorarios() {
		return horarioRepository.findAll();
	}
	
	@GetMapping("/horarios/{id}")
	public Horario horarioEscolhido(@PathVariable(value="id") long id) {
		return horarioRepository.findById(id);
	}
	
	@PostMapping("/horarios")
	public Horario salvaHorario(@RequestBody Horario horario) {
		return horarioRepository.save(horario);
		
	}
	
	@DeleteMapping("/horarios")
	public void deletaHorario(@RequestBody Horario horario) {
		horarioRepository.delete(horario);
		
	}

}
