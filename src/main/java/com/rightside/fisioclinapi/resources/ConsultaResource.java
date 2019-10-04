package com.rightside.fisioclinapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rightside.fisioclinapi.models.Consulta;
import com.rightside.fisioclinapi.models.Paciente;
import com.rightside.fisioclinapi.repository.ConsultaRepository;
import com.rightside.fisioclinapi.repository.PacienteRepository;

@RestController
@RequestMapping(value="/api")
public class ConsultaResource {
	
	@Autowired
	ConsultaRepository consultaRepository;
	
	@GetMapping("/consultas")
	public List<Consulta> listaConsultas() {
		return consultaRepository.findAll();
	}
	
	@GetMapping("/consultas/{id}")
	public Consulta unicaConsulta(@PathVariable(value="id") long id) {
		return consultaRepository.findById(id);
	}
	
	@PostMapping("/consultas")
	public Consulta salvaConsulta(@RequestBody Consulta consulta) {
		return consultaRepository.save(consulta);
		
	}
	
	@DeleteMapping("/consultas")
	public void deletaConsulta(@RequestBody Consulta consulta) {
		consultaRepository.delete(consulta);
		
	}
	
	@PutMapping("/consultas")
	public Consulta atualizaConsulta(@RequestBody Consulta consulta) {
		return consultaRepository.save(consulta);
	}


}
