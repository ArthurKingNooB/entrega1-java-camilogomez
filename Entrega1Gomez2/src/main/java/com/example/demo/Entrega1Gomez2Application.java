package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Models.Reserva;
import com.example.Models.cliente;
import com.example.dao.daoFactory;

@SpringBootApplication
public class Entrega1Gomez2Application implements CommandLineRunner{

	@Autowired
	private daoFactory dao;
	
	public static void main(String[] args) {
		SpringApplication.run(Entrega1Gomez2Application.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception{
		
		try {
		
			Reserva reserva1 = new Reserva("Juan");
			Reserva reserva2 = new Reserva("pepe");
			Reserva reserva3 = new Reserva("Alma marcela gozo");
			Reserva reserva4 = new Reserva("Roberto");
			Reserva reserva5 = new Reserva("alberto");
			
			
			
			cliente Cliente1 = new cliente("juan", "Diaz", 56666624, 19);
			cliente Cliente2 = new cliente("camilo", "gomez", 55234243, 19);
			cliente Cliente3 = new cliente("roberto", "gomez", 34243243, 19);
			cliente Cliente4 = new cliente("pepe", "argento", 65664545, 19);
			
			
			
			dao.persistirCliente(Cliente4);
			dao.persistirCliente(Cliente3);
			dao.persistirCliente(Cliente2);
			dao.persistirCliente(Cliente1);
			
			dao.persistirReserva(reserva5);
			dao.persistirReserva(reserva4);
			dao.persistirReserva(reserva3);
			dao.persistirReserva(reserva2);
			dao.persistirReserva(reserva1);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}
	
	
	
	
}


