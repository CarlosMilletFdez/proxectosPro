package teoria.capitulo07;

import misClases.teoria.CMatrizReales;

public class CAPMatrizReales {

	public static void main(String[] args) {

		CMatrizReales matrizR = new CMatrizReales();
		matrizR.crea();
		matrizR.llena();
		matrizR.amosa();
		matrizR.modificaElemento(matrizR.dameIndice());
		matrizR.amosa();

	}

}
