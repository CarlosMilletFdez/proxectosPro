package misClases.teoria;

import misClases.utilidades.DatosPersonales;

public class CMatrizCadenas {

	private char[][] matriz;
	private int nElementos;

	public void crea() {

		System.out.println("Numero de personas: ");
		nElementos = Leer.datoInt();
		matriz = new char[nElementos][];

	}

	private char[] dameDato() {

		char[] dato;

		dato = (DatosPersonales.dameNombre() + " " + DatosPersonales.dameApellido() + " "
				+ DatosPersonales.dameApellido()).toCharArray();

		return dato;

	}

	public void llena() {

		for (int i = 0; i < nElementos; i++) {

			matriz[i] = dameDato();

		}
	}

	public int dameIndice() {

		int indice;
		System.out.println("\nAnulamos elemento: ");

		do {
			System.out.println("Dame índice: ");
			indice = Leer.datoInt();
		}

		while (indice < 0 || indice > nElementos - 1);

		return indice;
	}

	public void anulaElemento(int indice) {
		int i;

		for (i = indice; i < nElementos - 1; i++)
			matriz[i] = matriz[i + 1];
		nElementos--;

	}

	public void amosa() {

		for (int i = 0; i < nElementos; i++) {

			System.out.println(i + "-> " + String.valueOf(matriz[i]) + " (" + matriz[i].length + ")");
			
		}
	}

}
