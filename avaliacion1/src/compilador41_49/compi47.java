package compilador41_49;

import java.io.IOException;

public class compi47 {

	public static void main(String[] args) throws IOException {

		char letra;
		int numespacio = 0, numa = 0;

		System.out.print(">");

		letra = (char) System.in.read();

		while (letra != '\r') {

			System.out.print(letra);
			letra = (char) System.in.read();

			if (letra == ' ')
				numespacio = numespacio + 1;

			else if (letra == 'a')
				numa = numa + 1;

		}
		System.out.println("\nTotal espacios en blanco: " + numespacio);
		System.out.print("Total letra 'a': " + numa);

	}
}
