/**
 * 
 */
package com.javacurso.ejercicioevaluable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jose Antonio Gomez Rodriguez
 * @since 2023
 * @version 1.0.0
 * @See Vehiculo
 * @See conducible
 * @See moto
 * @See patinete
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		Moto moto = new Moto();
		moto.asignarMarca("Cupra");
		moto.asignarModelo("ff");
		moto.asignarAnio(2023);
		moto.encender();
		moto.conducir();
		moto.apagar();
		moto.recuperarVehiculoCompleto();
		moto.combustible();
		moto.indicePeligrosidad();
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		Patinete patinete= new Patinete();
		patinete.asignarMarca("Xiaomi");
		patinete.asignarModelo("MI 13");
		patinete.asignarAnio(2010);
		patinete.encender();
		patinete.conducir();
		patinete.apagar();
		patinete.recuperarVehiculoCompleto();
		patinete.combustible();
		patinete.indicePeligrosidad();
		
		
		
		
	}
	
	

}
