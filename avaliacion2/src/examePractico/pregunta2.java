package examePractico;

import java.io.IOException;
import examePractico.avaliacion2.CCadena;

public class pregunta2 {

	public static void main(String[] args) throws IOException {

		CCadena cadena = new CCadena();
		System.out.print("Dame cadena: ");
		cadena.recolleCadena();
		cadena.eliminaVocalesEnCadena();
		System.out.print("Cadena sin vocales: ");
		cadena.amosaCadena();

	}

}
