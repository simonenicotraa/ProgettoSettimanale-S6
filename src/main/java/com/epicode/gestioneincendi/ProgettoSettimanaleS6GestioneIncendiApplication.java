package com.epicode.gestioneincendi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.epicode.gestioneincendi.centrocontrollo.CentroDiControlloConcreta;
import com.epicode.gestioneincendi.sonde.Observer;
import com.epicode.gestioneincendi.sonde.Sonda;

@SpringBootApplication
public class ProgettoSettimanaleS6GestioneIncendiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgettoSettimanaleS6GestioneIncendiApplication.class, args);
	}

}
