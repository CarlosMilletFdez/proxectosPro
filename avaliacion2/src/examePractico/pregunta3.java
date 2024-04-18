package examePractico;

import java.io.IOException;

import examePractico.avaliacion2.CRecursivo;

public class pregunta3 {

	public static void main(String[] args) throws IOException {

		CRecursivo recursivo = new CRecursivo();
		System.out.println("Dame cadena: ");
		recursivo.recolleCadena();
		recursivo.amosa467DuplicadosReves(0);

	}

}
