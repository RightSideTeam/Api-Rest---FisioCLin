package com.rightside.fisioclinapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rightside.fisioclinapi.models.Horario;
import com.rightside.fisioclinapi.repository.HorarioRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins="*")
public class HorarioResource {
	
	@Autowired
	HorarioRepository horarioRepository;
	
	
	@RequestMapping(value="/horarios/{diaSemana}", method = RequestMethod.GET)
	public List<Horario> listaHorariosDia(@PathVariable("diaSemana") String diaSemana) {
		return horarioRepository.findBydiaSemana(diaSemana);
	}
	
	@GetMapping("/horarios")
	@ApiOperation(value = "Retorna Lista de horarios")
	public List<Horario> listaHorarios(@RequestParam(value="diaSemana", required=false) String diaSemana) {
			return horarioRepository.findAll();
	}
	
	
	@PostMapping("/horarios")
	@ApiOperation(value="Salva um horario (somente a fisioterapeuta deve usar)")
	public Horario salvaHorario(@RequestBody Horario horario) {
		return horarioRepository.save(horario);
		
	}
	
	@DeleteMapping("/horarios")
	@ApiOperation(value="Deleta um Horario (somente a fisioterapeuta deve usar)")
	public void deletaHorario(@RequestBody Horario horario) {
		horarioRepository.delete(horario);
		
	}
	
	@PutMapping("/horarios")
	@ApiOperation(value="Atualiza um horario(somente a fisioterapeuta deve usar)")
	public Horario atualizaHorario(@RequestBody Horario horario) {
		return horarioRepository.save(horario);
	}

}
