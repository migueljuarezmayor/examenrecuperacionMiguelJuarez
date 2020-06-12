package com.miguel.model;

public class Usuario extends Registro{

	private int Numero_Usuario;
	private int Bicicletas_Totales_Usadas;
	private int Numero_Serie_Bicicletas_Usadas;
	private int Distancia_Recorrida;
	private int Historial_Uso;
	
	
	public Usuario(String nombre, String apellidos, int dNI, int numero_Usuario, int bicicletas_Totales_Usadas,
			int numero_Serie_Bicicletas_Usadas, int distancia_Recorrida, int historial_Uso) {
		super(nombre, apellidos, dNI);
		Numero_Usuario = numero_Usuario;
		Bicicletas_Totales_Usadas = bicicletas_Totales_Usadas;
		Numero_Serie_Bicicletas_Usadas = numero_Serie_Bicicletas_Usadas;
		Distancia_Recorrida = distancia_Recorrida;
		Historial_Uso = historial_Uso;
	}


	public int getNumero_Usuario() {
		return Numero_Usuario;
	}


	public void setNumero_Usuario(int numero_Usuario) {
		Numero_Usuario = numero_Usuario;
	}


	public int getBicicletas_Totales_Usadas() {
		return Bicicletas_Totales_Usadas;
	}


	public void setBicicletas_Totales_Usadas(int bicicletas_Totales_Usadas) {
		Bicicletas_Totales_Usadas = bicicletas_Totales_Usadas;
	}


	public int getNumero_Serie_Bicicletas_Usadas() {
		return Numero_Serie_Bicicletas_Usadas;
	}


	public void setNumero_Serie_Bicicletas_Usadas(int numero_Serie_Bicicletas_Usadas) {
		Numero_Serie_Bicicletas_Usadas = numero_Serie_Bicicletas_Usadas;
	}


	public int getDistancia_Recorrida() {
		return Distancia_Recorrida;
	}


	public void setDistancia_Recorrida(int distancia_Recorrida) {
		Distancia_Recorrida = distancia_Recorrida;
	}


	public int getHistorial_Uso() {
		return Historial_Uso;
	}


	public void setHistorial_Uso(int historial_Uso) {
		Historial_Uso = historial_Uso;
	}
	
	
	

	
}
