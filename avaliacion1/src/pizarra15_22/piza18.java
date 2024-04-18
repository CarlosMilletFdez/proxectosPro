package pizarra15_22;

import java.io.IOException;

public class piza18 {

	public static void main(String[] args) throws IOException {
		System.out.print("Pulse unha tecla: ");
		char letra;
		letra = (char) System.in.read();
		if (letra >='a' && letra<='z') {
			System.out.println("Pulsouse esta tecla: " + letra);
			System.out.println("E MINUSCULA");
		}else {
			System.out.println("Tecla NON PERMITIDA: " + letra);
		}

	}

}
