/**
 * 
 */
package com.javacurso.ejercicioevaluable;

/**
 *@version 1.0.0
 * @autor José Antonio Gómez Rodríguez
 * @since 2023
 */
public abstract class Vehiculo {
	
	/*
	 * Variables de vehiculo
	 */
	protected int nRuedas;
	
	/*
	 * Contructor para el numero de ruedas del vehiculo
	 */

	public Vehiculo(int nRuedas) {
		super();
		this.nRuedas = nRuedas;
	}

	public Vehiculo() {
		super();
	}
	
	/*
	 * Metodo para encender el vehiculo con impresion de un texto por consola
	 */
	
	public void encender() {
		System.out.println("Vehiculo totalmente encendido");
	}
	
	/*
	 * Metodo para apagar el vehiculo con impresion de un texto por consola
	 */
	
	public void apagar() {
		System.out.println("Vehiculo totalmente parado");
	}

	/*
	 * Metodo para asignar un modelo al vehiculo, el cual hay que añadir por parametro como String el nombre, con impresion de un texto por consola
	 */
	
	public void asignarModelo(String modelo) {
		System.out.println("Modelo asignado correctamente");
		
	}
	
	/*
	 * Metodo para asignarle un año al vehiculo, el cual hay que añadir por parametro como integer el anio, con impresion de un texto por consola
	 */

	public void asignarAnio(int anio) {
		System.out.println("Año asignado correctamente");
	}
	


}
