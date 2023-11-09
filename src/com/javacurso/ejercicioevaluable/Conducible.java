/**
 * 
 */
package com.javacurso.ejercicioevaluable;

/**
 * @author José Antonio Gómez Rodríguez
 *@version 1.0.0
 *@since 2023
 *
 */
public interface Conducible {
	
	/*
	 * Metodos de la clase conducible
	 */

	void asignarMarca(String marca);
	void asignarModelo(String modelo);
	void asignarAnio(int anio);
	String recuperarVehiculoCompleto();
	void conducir();
	void combustible();
	void indicePeligrosidad();
}
