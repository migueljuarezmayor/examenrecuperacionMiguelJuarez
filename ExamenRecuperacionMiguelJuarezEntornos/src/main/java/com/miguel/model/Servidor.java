package com.miguel.model;

public class Servidor {

	private String Registros;
	private String Base_Datos;
	private String Pagina_Web;
	
	
	
	public Servidor(String registros, String base_Datos, String pagina_Web) {
		super();
		Registros = registros;
		Base_Datos = base_Datos;
		Pagina_Web = pagina_Web;
	}



	public String getRegistros() {
		return Registros;
	}

	public void setRegistros(String registros) {
		Registros = registros;
	}
	public String getBase_Datos() {
		return Base_Datos;
	}

	public void setBase_Datos(String base_Datos) {
		Base_Datos = base_Datos;
	}

	public String getPagina_Web() {
		return Pagina_Web;
	}

	public void setPagina_Web(String pagina_Web) {
		Pagina_Web = pagina_Web;
	}
	
}
