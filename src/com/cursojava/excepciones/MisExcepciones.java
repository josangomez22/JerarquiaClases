package com.cursojava.excepciones;

public class MisExcepciones extends Exception{
	
	private int codigoError;

	public MisExcepciones(int codigoError) {
		super();
		this.codigoError = codigoError;
	}
	
	@Override
	public String getMessage() {
		String mensaje="";
		switch(codigoError){
		case 1:
			mensaje="El vehiculo se encuentra averiado en estos momentos, tiene que volver a pasar la itv";
			break;
		case 2:
			mensaje="Solo puedes elejir patinetes de la marca de xiaomi";
			break;
		case 3:
			mensaje= "Solo pueden asignarse los modelos de Yaris";
			break;
		case 4:
			mensaje="No puedo enseñarte el vehiculo completo porque has introducido datos erroneos";
			break;
		}
		return mensaje;
	}

}
