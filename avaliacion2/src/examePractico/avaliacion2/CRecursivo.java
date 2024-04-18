package examePractico.avaliacion2;

import java.io.IOException;

public class CRecursivo {

	private char[] cadena = new char[40];


	public void recolleCadena() throws IOException {

		char letra;
		int i;

		letra = (char) System.in.read();

		i = 0;

		while (letra != '\r') {

			cadena[i] = letra;
			letra = (char) System.in.read();
			i++;
		}
	}

	
	public void amosa467DuplicadosReves(int n) {
		
		
		if (cadena[n]!='\0') {

			amosa467DuplicadosReves(n + 1);
			
			if (cadena[n] == '4' || cadena[n] == '6' || cadena[n] == '7' ) {

				System.out.print(cadena[n]);

			}
			System.out.print(cadena[n]);

		}
		
	}
}
