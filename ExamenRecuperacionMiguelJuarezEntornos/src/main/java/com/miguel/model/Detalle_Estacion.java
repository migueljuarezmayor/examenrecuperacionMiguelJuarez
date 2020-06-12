package com.miguel.model;

import java.util.List;

public class Detalle_Estacion extends Estacion {
	
	
	private int Numero_estacion;
	private String Ubicacion;
	private int Espacios_Totales;
	
	
	public Detalle_Estacion(int bicicletas_Disponibles, Number huecos_Aparcar, int bicicletas_Averiadas,
			Number total_espacios, List<Bicicleta> listaBicicletas, int numero_estacion, String ubicacion,
			int espacios_Totales) {
		super(bicicletas_Disponibles, huecos_Aparcar, bicicletas_Averiadas, total_espacios, listaBicicletas);
		Numero_estacion = numero_estacion;
		Ubicacion = ubicacion;
		Espacios_Totales = espacios_Totales;
	}


	public int getNumero_estacion() {
		return Numero_estacion;
	}


	public void setNumero_estacion(int numero_estacion) {
		Numero_estacion = numero_estacion;
	}


	public String getUbicacion() {
		return Ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}


	public int getEspacios_Totales() {
		return Espacios_Totales;
	}


	public void setEspacios_Totales(int espacios_Totales) {
		Espacios_Totales = espacios_Totales;
	}
	
	
	

	
}
