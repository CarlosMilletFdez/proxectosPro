package piza201_208;

import java.io.IOException;
import misClases.avaliacion2.CCadena;

public class piza208 {

	public static void main(String[] args) throws IOException {
		
		CCadena cadena = new CCadena();
		System.out.print("Dame cadena: ");
		cadena.recolleCadena();
		cadena.eliminaPares();
		System.out.print("Cadena sin las letras pares: ");
		cadena.amosaCadena();
	}

}
