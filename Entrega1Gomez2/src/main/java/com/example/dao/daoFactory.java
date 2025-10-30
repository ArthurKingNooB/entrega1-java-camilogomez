package com.example.dao;

import org.springframework.stereotype.Service;

import com.example.Models.Reserva;
import com.example.Models.cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class daoFactory {

	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void persistirCliente(cliente cliente) {
		em.persist(cliente);
		
	}
	
	@Transactional
	public void persistirReserva(Reserva reserva) {
		em.persist(reserva);
	}
	
}
