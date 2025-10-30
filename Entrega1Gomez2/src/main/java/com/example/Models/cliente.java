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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cllientes")
public class cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="Nombre", nullable = false)
	private String nombre;
	@Column(name ="Apellido", nullable = false)
	private String apellido;
	@Column(name ="Cedula", nullable = false, unique = true)
	private int ci;
	@Column(name ="Edad")
	private int edad;
	
	
	@ManyToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
	private List<Reserva> reserva = new ArrayList<>();
	
	private LocalDateTime createCt;
	
	
	
	public cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public cliente(String nombre, String apellido, int ci, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.ci = ci;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", ci=" + ci + ", edad=" + edad
				+ ", createCt=" + createCt +"]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public LocalDateTime getCreateCt() {
		return createCt;
	}
	public void setCreateCt(LocalDateTime createCt) {
		this.createCt = createCt;
	}
	public List<Reserva> getReserva() {
		return reserva;
	}
	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
