package examePractico.avaliacion2;

import java.io.IOException;

public class CCadena {
	
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

	public void amosaCadena() {
		
		int i= 0;
		while (cadena[i] != '\0') {
			
			System.out.print(cadena[i]);
			i++;
		}		
	}
	
	public void eliminaVocalesEnCadena() {

		int i = 0, j = 0;

		while (cadena[i] != '\0') {
			
			if (cadena[i] == 'a' || cadena[i] =='e' || cadena[i]=='i' || cadena[i]=='o' || cadena[i]=='u' )
				i++;
			
			else {
				
				if (i > j)
					cadena[j] = cadena[i];
				i++;
				j++;
			}
		}
		
			i++;
		
		while (j < i) {

			cadena[j] = '\0';
			j++;
		}
		
		
	}
}
