package compilador41_49;

import java.io.IOException;

public class compi45 {

	public static void main(String[] args) throws IOException {

		char letra;
		System.out.print(">");
		letra = (char) System.in.read();

		while (letra != '\r') {

			letra = (char) (letra + 3);
			System.out.print(letra);
			letra = (char) System.in.read();
		}
	}
}
