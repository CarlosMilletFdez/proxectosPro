package provisional;

import java.io.IOException;

import misClases.avaliacion2.CRecursivo;

public class pregunta3 {

	public static void main(String[] args) throws IOException {

		int n=0;
		CRecursivo recursivo= new CRecursivo();
		System.out.print("Dame cadena: ");
		recursivo.recolleCadena();
		recursivo.amosaRevesAaEeDuplicados(n);

	}

}
