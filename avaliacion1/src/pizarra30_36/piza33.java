package pizarra30_36;

import java.util.Scanner;
import java.io.IOException;

public class piza33 {

	public static void main(String[] args) throws IOException {
		
		char letra;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduza unha letra minúscula: ");
		letra = (char)System.in.read();
		teclado.nextLine();
		
		while (letra<'a'||letra>'z') {
			
			System.out.print("Introduza outra letra: ");
			letra = (char)System.in.read();
			teclado.nextLine();
		}
		System.out.println("FINAL");
		teclado.close();
	}
}
