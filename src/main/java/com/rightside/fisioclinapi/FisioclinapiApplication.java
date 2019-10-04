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
		
		Consulta consulta = new Consulta();
		Horario horario = new Horario();
		horario.setData("01/12/2020");
		horario.setDiaSemana("Quinta-feira");
		horario.setHora("23:30");
		horario.setId(1);
		Paciente paciente = new Paciente();
		paciente.setDataDeNascimento("01/12/1994");
		paciente.setEmail("matheusldasilva20088@gmail.com");
		paciente.setId(1);
		paciente.setSobrenome("lima");
		paciente.setTelefone("32991313947");
		paciente.setUrlFoto("www.google.com");
		
		
		consulta.setDescricao("Consulta de revisão, dor no joelho");
		consulta.setHorario(horario);
		consulta.setId(1);
		consulta.setPaciente(paciente);
		Gson gson = new Gson();
		String json = gson.toJson(consulta);
		
		System.out.println(json);
		
	}

}
