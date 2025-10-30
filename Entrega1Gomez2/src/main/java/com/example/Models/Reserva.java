package com.example.Models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Reservas")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name ="NombreCliente", nullable = false)
	private String nombreCliente;
	@Column(name ="Lugares", nullable = false)
	private int lugares;
	
	private LocalDateTime createRt;
	
	@Column(name ="Dosponibilidad", nullable = false)
	private boolean disponible = true;
	
	@ManyToMany(fetch = FetchType.EAGER)
@JoinTable(
		name = "cliente_reserva",
		joinColumns = @JoinColumn(name = "curso_id"),
		inverseJoinColumns = @JoinColumn(name ="clietne_id")
		
		)
	private List<cliente> clientes = new ArrayList<>();

	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Reserva(String nombreCliente) {
		super();
		this.nombreCliente = nombreCliente;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getLugares() {
		return lugares;
	}

	public void setLugares(int lugares) {
		this.lugares = lugares;
	}

	public LocalDateTime getCreateRt() {
		return createRt;
	}

	
	public void setCreateRt(LocalDateTime createRt) {
		this.createRt = createRt;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public List<cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", nombreCliente=" + nombreCliente + ", lugares=" + lugares + ", createRt="
				+ createRt + ", disponible=" + disponible + "]";
	}

	
}
