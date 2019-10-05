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
import org.springframework.web.bind.annotation.RestController;

import com.rightside.fisioclinapi.models.Horario;
import com.rightside.fisioclinapi.models.Paciente;
import com.rightside.fisioclinapi.repository.HorarioRepository;
import com.rightside.fisioclinapi.repository.PacienteRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins="*")
public class PacienteResource {
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	@GetMapping("/pacientes")
	@ApiOperation(value="Retorna uma lista de Pacientes")
	public List<Paciente> listaPacientes() {
		return pacienteRepository.findAll();
	}
	
	@GetMapping("/pacientes/{id}")
	@ApiOperation(value="Retorna um unico paciente")
	public Paciente unicoPaciente(@PathVariable(value="id") long id) {
		return pacienteRepository.findById(id);
	}
	
	@PostMapping("/pacientes")
	@ApiOperation(value="Salva um novo paciente")
	public Paciente salvaPaciente(@RequestBody Paciente paciente) {
		return pacienteRepository.save(paciente);
		
	}
	
	@DeleteMapping("/pacientes")
	@ApiOperation(value="Deleta um paciente")
	public void deletaPaciente(@RequestBody Paciente paciente) {
		pacienteRepository.delete(paciente);
		
	}
	
	@PutMapping("/pacientes")
	@ApiOperation(value="Atualiza um paciente")
	public Paciente atualizaPaciente(@RequestBody Paciente paciente) {
		return pacienteRepository.save(paciente);
	}

}
