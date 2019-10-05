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
		
		
	}

}
