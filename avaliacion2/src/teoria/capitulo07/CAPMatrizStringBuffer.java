package teoria.capitulo07;

import misClases.teoria.CMatrizStringBuffer;

public class CAPMatrizStringBuffer {

	public static void main(String[] args) {

		CMatrizStringBuffer matrizSB = new CMatrizStringBuffer();
		matrizSB.crea();
		matrizSB.llena();
		matrizSB.amosa();
		matrizSB.modificaElemento(matrizSB.dameIndice());
		matrizSB.amosa();

	}

}
