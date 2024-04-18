package misClases.avaliacion2;

import java.io.IOException;

public class CCadena2 {
	
	private char[] cadena= new char [30];
	
	public void recolleCadena() throws IOException {
		
		int i=0;
		char letra;
		
		letra = (char) System.in.read();
		
		while (letra != '\r') {
		
			cadena [i] = letra;
			letra=(char)System.in.read();
			i++;
		}
	}
	
	public void amosaCadena() {
		
		int i=0;
	
		while (cadena[i]!='\0') {
			
			System.out.print(cadena[i]);
			i++;
		}
	}
	
	public void eliminaEnCadena(char letra) {
		
		int i=0,j=0;
		
		
		while (cadena[i]!='\0') {
			
			if (cadena[i]!=letra) {
				
				cadena[j]=cadena[i];
			
				j++;
			} 
				
			i++;
		}
		
		while (j<i) {
			cadena[j]='\0';
			j++;
		}
	}
}
