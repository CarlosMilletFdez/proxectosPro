package teoria.capitulo07;

import misClases.teoria.CMatrizCadenas;

public class CAPMatrizCadenas {

	public static void main(String[] args) {

		CMatrizCadenas matrizC = new CMatrizCadenas();
		matrizC.crea();
		matrizC.llena();
		matrizC.amosa();
		matrizC.anulaElemento(matrizC.dameIndice());
		matrizC.amosa();
	}

}
