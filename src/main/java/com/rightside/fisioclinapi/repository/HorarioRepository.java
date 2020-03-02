package com.rightside.fisioclinapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rightside.fisioclinapi.models.Consulta;
import com.rightside.fisioclinapi.models.Horario;

public interface HorarioRepository extends JpaRepository<Horario, Long> {

	
	Horario findById(long id);

	List<Horario> findBydiaSemana(String diaSemana);

	
	

}
