package com.miguel.model;

import java.util.List;

public class Averias {

	public String Nombre_Averia;
	public int Nuemro_Averia;
	List<Averias> averias;
	
	
	public Averias(String nombre_Averia, int nuemro_Averia, List<Averias> averias) {
		super();
		Nombre_Averia = nombre_Averia;
		Nuemro_Averia = nuemro_Averia;
		this.averias = averias;
	}


	public Averias(String string) {
		// TODO Auto-generated constructor stub
	}


	public String getNombre_Averia() {
		return Nombre_Averia;
	}


	public void setNombre_Averia(String nombre_Averia) {
		Nombre_Averia = nombre_Averia;
	}


	public int getNuemro_Averia() {
		return Nuemro_Averia;
	}


	public void setNuemro_Averia(int nuemro_Averia) {
		Nuemro_Averia = nuemro_Averia;
	}


	public List<Averias> getAverias() {
		return averias;
	}


	public void setAverias(List<Averias> averias) {
		this.averias = averias;
	} 
	
	
	
	
}
