package com.rightside.fisioclinapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rightside.fisioclinapi.models.Consulta;
import com.rightside.fisioclinapi.models.Paciente;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

	Consulta findById(long id);
}
