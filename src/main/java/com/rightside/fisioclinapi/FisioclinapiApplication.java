package com.rightside.fisioclinapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;
import com.rightside.fisioclinapi.models.Consulta;
import com.rightside.fisioclinapi.models.Horario;
import com.rightside.fisioclinapi.models.Paciente;

@SpringBootApplication
public class FisioclinapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FisioclinapiApplication.class, args);
		
		Horario horario = new Horario();
		horario.setData("teste");
		horario.setDiaSemana("segunda");
		horario.setHora("15:50");
		
		Gson gson = new Gson();
		System.out.println(gson.toJson(horario));
		
		Consulta consulta = new Consulta();
		consulta.setHorario(horario);
		consulta.setDescricao("paciente com dor de cabeça");
		Gson gon = new Gson();
		gon.toJson(consulta);
		
		System.out.println(gon);
	}

}
