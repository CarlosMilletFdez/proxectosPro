package misClases.teoria;

import misClases.utilidades.DatosPersonales;

public class CMatrizString {
	
	private String [] matriz;
	
	public void crea() {
		
		int nElementos;
		System.out.println("Numero de personas: ");
		nElementos = Leer.datoInt();
		matriz = new String[nElementos];
		
	}
	
	public void llena() {

		for (int i = 0; i < matriz.length; i++)
			matriz[i] = dameDato();
	}

	private String dameDato() {
		String string;
		string =  DatosPersonales.dameNombre() + " " + DatosPersonales.dameApellido() + " " + DatosPersonales.dameApellido() ;

		return string;
	}

	public void amosa() {

		int n = 0;
		System.out.println("Matriz de Personas");
		while (n < matriz.length) {
			System.out.println(n + "-> " + matriz[n] + "("+ matriz[n].length() + ") ");
			n++;
		}
	}
	
}
