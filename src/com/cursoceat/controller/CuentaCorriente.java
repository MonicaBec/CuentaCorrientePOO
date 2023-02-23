package com.cursoceat.controller;

public class CuentaCorriente {
	
	Gestor miGestor; //Gestor que administra la cuenta 
	
	public String nombre;
	String dni;
	private double saldo;
	static private String nombreBanco="International Java Bank";

	
	//metodos getter y setter de nombreBanco
   public static String getNombreBanco() {
		return nombreBanco;
	}

	public static void setNombreBanco(String nombreBanco) {
		CuentaCorriente.nombreBanco = nombreBanco;
	}

public CuentaCorriente (String nombre, String dni) {
	   this.nombre= nombre;
	   this.dni= dni;
	   this.saldo=0;
   }

   public CuentaCorriente(String dni, double saldo) {
	   this.dni=dni;
	   this.saldo= saldo;
	   this.nombre="Sin definir";
   }
   
   
   
   public CuentaCorriente(Gestor miGestor, String nombre, String dni, double saldo) {
	this.miGestor = miGestor;
	this.nombre = nombre;
	this.dni = dni;
	this.saldo = saldo;
}
   //asignar un nuevo gestor a la cuenta
   void setGestor(Gestor miGestor) {
	   this.miGestor=miGestor;
   }

boolean egreso(double cant) {
	   boolean operacionPosible = false;
	   if(saldo>=cant) {
		   saldo-=cant;
	   }else{
System.out.println("No tiene saldo sucifiente");
 operacionPosible=false;
	   }
	   
	   return operacionPosible;
   }
   
   void ingreso(double cant) {
	   saldo+=cant;
	   System.out.println("Tu nuevo saldo es "+saldo);
   }
   
   
   void mostrarInformacion() {
	   
	   if(miGestor==null) {//La cuenta no tiene gestor
		   System.out.println("La cuenta no tiene gestor ");
		   }else {
			   System.out.println("Datos del gestor" +miGestor);
			   miGestor.mostrarInfoGestor();
		   }
	   
	   //Mostramos informacion de la cta.
	   System.out.println("Nombre :"+nombre);
	   System.out.println("dni :"+dni);
	   System.out.println("saldo :"+saldo);
	   System.out.println("Nombre del banco "+nombreBanco);
	   
   }
   
}
