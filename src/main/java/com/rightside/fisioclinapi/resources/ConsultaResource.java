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

import com.rightside.fisioclinapi.models.Consulta;
import com.rightside.fisioclinapi.models.Paciente;
import com.rightside.fisioclinapi.repository.ConsultaRepository;
import com.rightside.fisioclinapi.repository.PacienteRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST CONSULTAS")
@CrossOrigin(origins="*")
public class ConsultaResource {
	
	@Autowired
	ConsultaRepository consultaRepository;
	
	@GetMapping("/consultas")
	@ApiOperation(value="Retorna uma lista de consultas")
	public List<Consulta> listaConsultas() {
		return consultaRepository.findAll();
	}
	
	@GetMapping("/consultas/{id}")
	@ApiOperation(value="Retorna uma consulta especifica")
	public Consulta unicaConsulta(@PathVariable(value="id") long id) {
		return consultaRepository.findById(id);
	}
	
	@PostMapping("/consultas")
	@ApiOperation(value="Salva uma consulta")
	public Consulta salvaConsulta(@RequestBody Consulta consulta) {
		return consultaRepository.save(consulta);
		
	}
	
	@DeleteMapping("/consultas")
	@ApiOperation(value="Deleta uma consulta")
	public void deletaConsulta(@RequestBody Consulta consulta) {
		consultaRepository.delete(consulta);
		
	}
	
	@PutMapping("/consultas")
	@ApiOperation(value="Edita uma consulta")
	public Consulta atualizaConsulta(@RequestBody Consulta consulta) {
		return consultaRepository.save(consulta);
	}


}
