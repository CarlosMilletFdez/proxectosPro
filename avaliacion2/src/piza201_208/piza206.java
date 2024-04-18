package piza201_208;

import java.io.IOException;
import misClases.avaliacion2.CCadena;
import java.util.Scanner;

public class piza206 {

	public static void main(String[] args) throws IOException {

		
		Scanner teclado = new Scanner(System.in);
		
		char letra;


			
			CCadena cadena = new CCadena();

            System.out.print("Dame cadena: ");
			cadena.recolleCadena();
			cadena.amosaCadena();
			System.out.print("\nDame letra a eliminar en cadena: ");
			teclado.nextLine();
			letra = (char) System.in.read();

			cadena.eliminaEnCadena(letra);
			System.out.print("Cadea sen a letra (" + letra + ") : ");
			cadena.amosaCadena();
			
//		}
		
		teclado.close();
		
	}

}
