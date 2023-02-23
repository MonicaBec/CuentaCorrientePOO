package com.cursoceat.controller;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       //Mi objeto 1 -> miCta
		System.out.println("Indique el nombre");
		
		String nombre=new Scanner(System.in).nextLine();
		
		System.out.println("Indique el DNI");
		String midni=new Scanner(System.in).nextLine();
		
		CuentaCorriente miCta= new CuentaCorriente(nombre,midni);
		//preguntamos el importe a ingresar
		System.out.println("Cuanto quieres ingresar");
		double miIngreso= new Scanner(System.in).nextDouble();
		//actualiza el saldo segun el importe ingresado
		
		miCta.ingreso(miIngreso);
		//pregunto el banco
		System.out.println("Nombre del banco :");
		CuentaCorriente.setNombreBanco(new Scanner(System.in).nextLine());
		//preguntamos el importe a retirar
		
		System.out.println("Cuanto quieres retirar?");
		double miEgreso=new Scanner(System.in).nextDouble();

		//actualizamos el saldo restando el importe retirado
		miCta.egreso(miEgreso);
		//creamos gestor 1
		Gestor miGestor1= new Gestor("pepelu ", "06529258M");
		miCta.miGestor=miGestor1;
		
		//mostramos la informacion
		miCta.mostrarInformacion();
		
		//creo mi objeto 2
		System.out.println("*******Creo el objeto 2**********");
		System.out.println("Indique el dni :");
		midni=new Scanner(System.in).nextLine();
		System.out.println("indique el saldo inicial al crear la cuenta");
		Double saldoInicial= new Scanner(System.in).nextDouble(); 
		CuentaCorriente miCta2= new CuentaCorriente(midni, saldoInicial);//llama al constructor
		
		System.out.println("Indique el nombre");
		miCta2.nombre= new Scanner(System.in).nextLine(); //Llamar
		
		//creo el gestor 2
		Gestor miGestor2=new Gestor("Bea","06585858B");
		miCta2.miGestor=miGestor2;
		
		System.out.println("Datos cuenta 1");
		miCta.mostrarInformacion();

		System.out.println("Datos cuenta 2");
		miCta2.mostrarInformacion();
	}

}
