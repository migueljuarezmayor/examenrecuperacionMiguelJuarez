package com.miguel.model;

import java.util.List;


public class Estacion {

	private int Bicicletas_Disponibles;
	private Number Huecos_Aparcar;
	private int Bicicletas_Averiadas;
	private List<Bicicleta> listaBicicletas;
	
	
	public Estacion(int bicicletas_Disponibles, Number huecos_Aparcar, int bicicletas_Averiadas, Number total_espacios,
			List<Bicicleta> listaBicicletas) {
		super();
		Bicicletas_Disponibles = bicicletas_Disponibles;
		Huecos_Aparcar = huecos_Aparcar;
		Bicicletas_Averiadas = bicicletas_Averiadas;

		this.listaBicicletas = listaBicicletas;
	}


	public int getBicicletas_Disponibles() {
		return Bicicletas_Disponibles;
	}


	public void setBicicletas_Disponibles(int bicicletas_Disponibles) {
		Bicicletas_Disponibles = bicicletas_Disponibles;
	}


	public Number getHuecos_Aparcar() {
		return Huecos_Aparcar;
	}


	public void setHuecos_Aparcar(Number huecos_Aparcar) {
		Huecos_Aparcar = huecos_Aparcar;
	}


	public int getBicicletas_Averiadas() {
		return Bicicletas_Averiadas;
	}


	public void setBicicletas_Averiadas(int bicicletas_Averiadas) {
		Bicicletas_Averiadas = bicicletas_Averiadas;
	}



	public List<Bicicleta> getListaBicicletas() {
		return listaBicicletas;
	}


	public void setListaBicicletas(List<Bicicleta> listaBicicletas) {
		this.listaBicicletas = listaBicicletas;
	}
	
	
	
	
}
