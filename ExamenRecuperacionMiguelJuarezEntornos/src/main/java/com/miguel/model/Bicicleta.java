package com.miguel.model;

import java.time.LocalDate;
import java.util.List;

public class Bicicleta {
	
	private int Numero_Bicicleta;
	private String Historial_Uso;
	private LocalDate Fecha_Reparacion;
	List<Averias> averias;
	
	
	public Bicicleta(int numero_Bicicleta, String historial_Uso, LocalDate fecha_Reparacion) {
		super();
		Numero_Bicicleta = numero_Bicicleta;
		Historial_Uso = historial_Uso;
		Fecha_Reparacion = fecha_Reparacion;
	}


	public int getNumero_Bicicleta() {
		return Numero_Bicicleta;
	}


	public void setNumero_Bicicleta(int numero_Bicicleta) {
		Numero_Bicicleta = numero_Bicicleta;
	}


	public String getHistorial_Uso() {
		return Historial_Uso;
	}


	public void setHistorial_Uso(String historial_Uso) {
		Historial_Uso = historial_Uso;
	}


	public LocalDate getFecha_Reparacion() {
		return Fecha_Reparacion;
	}


	public void setFecha_Reparacion(LocalDate fecha_Reparacion) {
		Fecha_Reparacion = fecha_Reparacion;
	}
	
	

	
	
}
