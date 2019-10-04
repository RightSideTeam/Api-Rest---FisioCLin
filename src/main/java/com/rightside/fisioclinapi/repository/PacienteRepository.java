package com.rightside.fisioclinapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rightside.fisioclinapi.models.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{
	
	Paciente findById(long id);

}
