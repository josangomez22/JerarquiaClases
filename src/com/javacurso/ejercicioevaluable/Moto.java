/**
 * 
 */
package com.javacurso.ejercicioevaluable;

import com.cursojava.excepciones.MisExcepciones;

/**
 * @author José Antonio Gómez Rodríguez
 * @version 1.0.0
 * @since 2023
 * @see vehiculo
 * @see Conducible
 */
public class Moto extends Vehiculo implements Conducible {
	
	/*
	 * variables de la clase Moto
	 */

	public static final String COMBUSTIBLE_VEHICULO = "Gasolina";
	final String RIESGO_PELIGRO = "Muy alto";
	protected String marca;
	protected String modelo;
	protected int anio;
	
	/*
	 * Constructor completo
	 */
	
	public Moto(int nRuedas, String marca, String modelo, int anio) {
		super(nRuedas);
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}

	/*
	 * Constructor vacio, añadiendo el numero de ruedas en el super
	 */
	
	public Moto() {
		super(3);
	}
	
	/*
	 * Metodo para asignarle una marca a la moto, entra por parametro en formato String y devuelve un texto por consola
	 */
	

	@Override
	public void asignarMarca(String marca) {
		this.marca = marca;
		System.out.println("Marca asignada a la moto: " + marca);
	}
	
	/*
	 * metodo que sirve para empezar la conduccion, devuelve por xonsola un texto
	 */

	@Override
	public void conducir() {
		System.out.println("Las motos son dificiles de manejar");
	}
	
	/*
	 * Metodo para asignarle un modelo a la moto, entra por parametro en formato String y devuelve un texto por consola
	 */

	@Override
	public void asignarModelo(String modelo) {
		try {
			if(modelo != "Yaris") {
				throw new MisExcepciones(3);
			}else {
				this.modelo = modelo;
				System.out.println("Modelo asignado: " + modelo);
			}
		}catch(MisExcepciones ex) {
				System.out.println(ex.getMessage());
			}
	}
	
	/*
	 * Metodo para asignarle un año a la moto, entra por parametro en formato Integer
	 *  y devuelve un texto por consola, tiene excepciones sino cumple con 
	 *  el año
	 */

	@Override
	public void asignarAnio(int anio) {
		try {
			if(anio < 2015) {
				throw new MisExcepciones(1);
			}else {
				this.anio = anio;
				System.out.println("Año asignado: " + anio);
			}
		}catch(MisExcepciones ex) {
				System.out.println(ex.getMessage());
			}
			
	}
	
	/*
	 * Metodo para recuperar el vehiculo completo y devuelve un texto por consola
	 * Tiene excepciones si no cumple con el modelo y el año
	 */

	@Override
	public String recuperarVehiculoCompleto() {
		try {
			if(modelo != "Yaris") {
				throw new MisExcepciones(4);
			}else if(anio < 2021) {
				throw new MisExcepciones(1);
			}else {
				System.out.println("Este es tu vehiculo: " + marca+ " "+ modelo + " "+ anio);
			}
		}catch(MisExcepciones ex) {
			System.out.println(ex.getMessage());
		}
		return marca + modelo + anio;
	}
	
	/*
	 * Metodo para indicar el combustible de la moto y devuelve un texto por consola
	 */
	
	@Override
	public void combustible() {
		System.out.println("El combustible de esta moto es: " + COMBUSTIBLE_VEHICULO);
	}
	
	/*
	 * Metodo para saber cua es el indice de peligrosidad de la moto y devuelve un texto por consola
	 */

	@Override
	public void indicePeligrosidad() {
		System.out.println("El riesgo de peligrosidad de esta moto es: " + RIESGO_PELIGRO);
		
	}
	
	
	
}
