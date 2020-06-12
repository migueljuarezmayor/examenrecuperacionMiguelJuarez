package com.miguel.model;

import java.time.LocalDate;

public class Detalle_Bicicleta extends Bicicleta {

	private int Numero_Serie;
	private int Veces_Reparada;
	private int Horas_Uso;
	private int Distancia_Total;
	private int N튝odulo_Diagnostico;
	
	
	
	
	public Detalle_Bicicleta(int numero_Bicicleta, String historial_Uso, LocalDate fecha_Reparacion, int numero_Serie,
			int veces_Reparada, int horas_Uso, int distancia_Total, int n튝odulo_Diagnostico, int numero_averia) {
		super(numero_Bicicleta, historial_Uso, fecha_Reparacion);
		Numero_Serie = numero_Serie;
		Veces_Reparada = veces_Reparada;
		Horas_Uso = horas_Uso;
		Distancia_Total = distancia_Total;
		N튝odulo_Diagnostico = n튝odulo_Diagnostico;

	}



	public int getNumero_Serie() {
		return Numero_Serie;
	}



	public void setNumero_Serie(int numero_Serie) {
		Numero_Serie = numero_Serie;
	}



	public int getVeces_Reparada() {
		return Veces_Reparada;
	}



	public void setVeces_Reparada(int veces_Reparada) {
		Veces_Reparada = veces_Reparada;
	}



	public int getHoras_Uso() {
		return Horas_Uso;
	}



	public void setHoras_Uso(int horas_Uso) {
		Horas_Uso = horas_Uso;
	}



	public int getDistancia_Total() {
		return Distancia_Total;
	}



	public void setDistancia_Total(int distancia_Total) {
		Distancia_Total = distancia_Total;
	}



	public int getN튝odulo_Diagnostico() {
		return N튝odulo_Diagnostico;
	}



	public void setN튝odulo_Diagnostico(int n튝odulo_Diagnostico) {
		N튝odulo_Diagnostico = n튝odulo_Diagnostico;
	}


	
}


