package com.miguel.model;

import java.time.LocalDate;

public class Mecanico extends Registro {

	private int Usuario;
	private int Bicicletas_Reparadas;
	private LocalDate Fecha_Reparaciones;
	
	
	public Mecanico(String nombre, String apellidos, int dNI, int usuario, int bicicletas_Reparadas,
			LocalDate fecha_Reparaciones) {
		super(nombre, apellidos, dNI);
		Usuario = usuario;
		Bicicletas_Reparadas = bicicletas_Reparadas;
		Fecha_Reparaciones = fecha_Reparaciones;
	}


	public int getUsuario() {
		return Usuario;
	}


	public void setUsuario(int usuario) {
		Usuario = usuario;
	}


	public int getBicicletas_Reparadas() {
		return Bicicletas_Reparadas;
	}


	public void setBicicletas_Reparadas(int bicicletas_Reparadas) {
		Bicicletas_Reparadas = bicicletas_Reparadas;
	}


	public LocalDate getFecha_Reparaciones() {
		return Fecha_Reparaciones;
	}


	public void setFecha_Reparaciones(LocalDate fecha_Reparaciones) {
		Fecha_Reparaciones = fecha_Reparaciones;
	}
	
	

	
}
