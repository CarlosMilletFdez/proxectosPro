package misClases.avaliacion2;

import java.io.IOException;

public class CCadena {

	private char[] cadena = new char[30];

	public void recolleCadena() throws IOException {// piza201

		char letra;
		int i;

		System.out.print("Dame cadena: ");
		letra = (char) System.in.read();

		i = 0;

		while (letra != '\r') {

			cadena[i] = letra;
			letra = (char) System.in.read();
			i++;
		}
	}

	public void amosaCadena() {// piza202 
		
		int i= 0;
		while (cadena[i] != '\0') {
			
			System.out.print(cadena[i]);
			i++;
		}		
	}

	public void amosaRevesCadena() {// piza203

		int i = 0;

		while (cadena[i] != '\0') {
			i++;
		}

		i--;

		while (i >= 0) {

			System.out.print(cadena[i]);
			i--;
		}
	}

	public void invirteCadena() {// piza204

		int i = 0, j = 0;
		char letra;

		while (cadena[i] != '\0') {
			i++;
		}

		i--;

		while (j < i) {

			letra = cadena[j];
			cadena[j] = cadena[i];
			cadena[i] = letra;
			j++;
			i--;

		}

	}

	public void capicua() {// piza205

		int i = 0, j = 0;

		while (cadena[i] != '\0') {
			i++;
		}

		j = i - 1;

		while (j >= 0) {

			cadena[i] = cadena[j];
			j--;
			i++;

		}

	}

	public void eliminaEnCadena(char letra) {// piza206

		int i = 0, j = 0;

		while (cadena[i] != '\0') {

			if (cadena[i] == letra)
				i++;

			else {
				if (i > j)
					cadena[j] = cadena[i];
				i++;
				j++;
			}
		}

		while (j < i) {

			cadena[j] = '\0';
			j++;
		}
	}

	public void repiteUnha() {// piza207

		int i = 0, j = 0;

		while (cadena[i] != '\0') {
			i++;
		}

		i--;
		
		while (i >= 0) {

			j = i * 2;
			cadena[j] = cadena[j + 1] = cadena[i];
			i--;
		}
	}
	
	public void eliminaPares() {//piza208
		
		int i = 0, j = 0;
		
		while (cadena[i] != '\0') {
			
			if (i % 2 != 0) {
			
				cadena[j] = cadena[i];
				j++;
			}
			
			i++;
		}
		
		while (i>=j) {
			
			cadena[i]='\0';
			i--;
		}

	}
	
	public void elimina125EnCadena() {// prepara02

		int i = 0, j = 0;

		while (cadena[i] != '\0') {

			if (i != 1 && i != 2 && i != 5) {
				cadena[j] = cadena[i];
				j++;
			}
			i++;
		}
		
		while (j < i) {

			cadena[j] = '\0';
			j++;
		}
	}
	
	public void duplica125EnCadena() {//prepara04
		
		int i = 0, j=0;

		while (cadena[i] != '\0') {
			
			if (i==1 || i==2 || i==5) {
				
				j++;
			}
			i++;
			j++;
		}

		i--;
		j--;
		
		while (j > 0) {
			
			cadena[j] = cadena[i];

			if (i==5 || i==2||i==1) {
				
				j--;
				cadena[j] = cadena[i];
			}
			
			i--;
			j--;
			
		}
	}
	
	public void duplicaNumerosEnCadena () {//prepara07
		
		int i = 0, j=0;

		while (cadena[i] != '\0') {
			
			if (cadena[i]>='0' && cadena [i]<='9') {
				
				j++;
			}
			i++;
			j++;
		}

		i--;
		j--;
		
		while (j >= 0) {
			
			cadena[j] = cadena[i];

			if (cadena[i]>='0' && cadena[i]<='9') {
				
				j--;
				cadena[j] = cadena[i];
			}
			
			i--;
			j--;
			
		}
	}

	public void duplicaEnCadena(char caracter) {//pregunta1
		
		int i = 0, j=0;

		while (cadena[i] != '\0') {
			
			if (cadena[i]== caracter) {
				
				j++;
			}
			i++;
			j++;
		}

		i--;
		j--;
		
		while (j >= 0) {
			
			cadena[j] = cadena[i];

			if (cadena[i]== caracter) {
				
				j--;
				cadena[j] = cadena[i];
			}
			
			i--;
			j--;
		
		}
	}
	
	public void amosaCaracteres3Dixitos2() {//pregunta1_a
		int i=0, j=0;
		
		while (cadena[i]!='\0') {
			if (cadena[i]>='0'&& cadena[i]<='9') {
				j++;
			}
			else if ((cadena[i]>='a'&& cadena[i]<='z') || (cadena[i]>='A'&& cadena[i]<='Z')) {
				j++;
				j++;
			}
			i++;
			j++;
		}
		
		while (j >= 0) {
			
			if (cadena[i]>='0' && cadena[i]<='9') {
				
				cadena[j]=cadena[j-1]= cadena[i];
				j--;
			}
			else if ((cadena[i]>='a'&& cadena[i]<='z') || (cadena[i]>='A'&& cadena[i]<='Z')) {
				
				cadena[j]=cadena[j-1]= cadena[j-2] = cadena[i];
				j--;
				j--;
			}
			else 
				cadena[j] = cadena[i];
			i--;
			j--;
		}
	}
}
