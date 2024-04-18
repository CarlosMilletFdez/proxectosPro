package provisional;

import java.io.IOException;
import java.util.Scanner;

import misClases.avaliacion2.CCadena;

public class pregunta1 {

	public static void main(String[] args) throws IOException {

		char caracter;
		CCadena cadena = new CCadena();
		Scanner teclado = new Scanner(System.in);
		
		cadena.recolleCadena();
		
		System.out.print("Letra a duplicar: ");
		teclado.nextLine();
		caracter= (char)System.in.read();
	
		cadena.duplicaEnCadena(caracter);
		cadena.amosaCadena();

	}

}
