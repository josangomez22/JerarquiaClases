/**
 * 
 */
package com.javacurso.ejercicioevaluable;

/**
 * @author José Antonio Gómez Rodríguez
 * @version 1.0.0
 * @since 2023
 * @see vehiculo
 * @see Conducible
 *
 */
public class Patinete extends Vehiculo implements Conducible {
	
	/*
	 * variables de la clase patinete
	 */
	private final String COMBUSTIBLE_VEHICULO = "Electricidad";
	final String RIESGO_PELIGRO = "Normal";
	protected String marca;
	protected String modelo;
	protected int anio;
	
	/*
	 * Constructor completo
	 */
	
	public Patinete(int nRuedas, String marca, String modelo, int anio) {
		super(nRuedas);
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}
	
	/*
	 * Constructor vacio, añadiendo el numero de ruedas en el super
	 */

	public Patinete() {
		super(2);
	}
	
	/*
	 * Primer metodo que sirve para empezar la conduccion, devuelve por xonsola un texto
	 */
	
	@Override
	public void conducir() {
		System.out.println("Los patinetes de la marca " + marca + " son mas inestables que la moto");
	}
	
	/*
	 * Metodo para asignarle una marca al patinete, entra por parametro en formato String y devuelve un texto por consola
	 */
	
	@Override
	public void asignarMarca(String marca) {
		this.marca = marca;
		System.out.println("Marca asignada " + marca);
	}

	/*
	 * Metodo para asignarle un modelo al patinete, entra por parametro en formato String y devuelve un texto por consola
	 */
	@Override
	public void asignarModelo(String modelo) {
		this.modelo = modelo;
		System.out.println("Modelo asignado: " + modelo);
	}

	/*
	 * Metodo para asignarle un año al patinete, entra por parametro en formato Integer y devuelve un texto por consola
	 */
	
	@Override
	public void asignarAnio(int anio) {
		this.anio = anio;
		System.out.println("Año asignado: " + anio);
	}
	
	/*
	 * Metodo para recuperar el vehiculo completo y devuelve un texto por consola
	 */

	@Override
	public String recuperarVehiculoCompleto() {
		System.out.println("Este es tu vehiculo: " + marca+ " "+ modelo + " "+ anio);
		return marca + modelo + anio;
	}
	
	/*
	 * Metodo para indicar el combustible del patinete y devuelve un texto por consola
	 */
	
	@Override
	public void combustible() {
		System.out.println("El combustible de este patin es: " + COMBUSTIBLE_VEHICULO);
	}

	/*
	 * Metodo para saber cua es el indice de peligrosidad del  patinete y devuelve un texto por consola
	 */
	
	@Override
	public void indicePeligrosidad() {
		System.out.println("El indice de peligrosidad de este patinete es: " + RIESGO_PELIGRO);
	}
	
	
	

}
