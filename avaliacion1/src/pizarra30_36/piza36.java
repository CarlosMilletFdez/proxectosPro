package pizarra30_36;

import java.util.Scanner;
import java.io.IOException;

public class piza36 {
	
	public static void main(String[] args) throws IOException {
		
		char letra;
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Introduza unha vocal minúscula: ");
		letra = (char) System.in.read();
		teclado.nextLine();
		
		while (letra == 'a'||letra == 'e'||letra == 'i'||letra == 'o'||letra == 'u') {
			
			System.out.println("CORRECTO e VOCAL minuscula: "+ letra);
			System.out.print("Introduza unha vocal minúscula: ");
			letra = (char) System.in.read();
			teclado.nextLine();
		}
		System.out.println("INCORRECTO non e VOCAL minuscula: " + letra);	
		teclado.close();	
	}

}
