package piza201_208;

import java.io.IOException;

import misClases.avaliacion2.CCadena2;

public class piza206_2 {

	public static void main(String[] args) throws IOException {
		
		char letra='a';
		CCadena2 cadena = new CCadena2();
		System.out.print("Dame cadena: ");
		cadena.recolleCadena();
		cadena.eliminaEnCadena(letra);
		System.out.print("Cadena sen a letra " + letra + ": " );
		cadena.amosaCadena();
	}

}
