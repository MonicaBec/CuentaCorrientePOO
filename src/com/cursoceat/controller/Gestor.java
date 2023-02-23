package com.cursoceat.controller;

public class Gestor {

	public String nombreGestor;
	private String telefono;
	double importeMax;
	
	//constructor con todos los atributos
	public Gestor(String nombreGestor, String telefono, double importeMax) {
		this.nombreGestor = nombreGestor;
		this.telefono = telefono;
		this.importeMax = importeMax;
	}
	
	//constructor solo con nombre y telefono
	public Gestor(String nombreGestor, String telefono) {
		this.nombreGestor = nombreGestor;
		this.telefono = telefono;
		this.importeMax=10000;
	}

     //metodo getter para consultar solo el telefono
	public String getTelefono() {
		return telefono;
	}
	
   
	void mostrarInfoGestor() {
		System.out.println("nombre del gestor :"+this.nombreGestor+" \nTeléfono"+this.telefono+
				"\n Importe Máximo :"+this.importeMax+"€");
	}
	
	
	
}
