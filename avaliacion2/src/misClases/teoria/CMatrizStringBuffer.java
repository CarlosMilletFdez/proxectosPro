package misClases.teoria;

import misClases.utilidades.DatosPersonales;

public class CMatrizStringBuffer {

	private StringBuffer[] matriz;

	public void crea() {

		int n;
		System.out.print("Numero de personas: ");
		n = Leer.datoInt();
		matriz = new StringBuffer[n];
	}

	public void llena() {

		for (int i = 0; i < matriz.length; i++)
			matriz[i] = dameDato();
	}

	public int dameIndice() {
		int indice = 0;

		System.out.println("\nModificamos elemento");

		do {

			System.out.print("Dame índice: ");
			indice = Leer.datoInt();

		}

		while (indice >= matriz.length || indice < 0);

		return indice;

	}

	private StringBuffer dameDato() {

		StringBuffer string = new StringBuffer(DatosPersonales.dameNombre() + " " + DatosPersonales.dameApellido() + " "
				+ DatosPersonales.dameApellido());

		return string;
	}

	public void modificaElemento(int indice) {

		matriz[indice] = dameDato();
	}

	public void amosa() {

		int n = 0;
		System.out.println("\nMatriz de Personas");
		while (n < matriz.length) {
			System.out.println(n + "-> " + matriz[n] + "(" + matriz[n].length() + ") ");
			n++;
		}

	}
}
