package pizarra30_36;

import java.util.Scanner;
import java.io.IOException;

public class piza34 {

	public static void main(String[] args) throws IOException {

		char letra;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduza unha letra minúscula: ");
		letra = (char) System.in.read();
		teclado.nextLine();

		while (letra >= 'a' && letra <= 'z') {

			System.out.println("CORRECTO é minúscula: " + letra);
			System.out.print("Introduza outra letra minúscula: ");
			letra = (char) System.in.read();
			teclado.nextLine();
		}
		System.out.println("INCORRECTO non é minúscula: " + letra);
		teclado.close();
	}
}