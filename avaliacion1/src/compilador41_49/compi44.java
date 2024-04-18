package compilador41_49;

import java.io.IOException;

public class compi44 {
	
public static void main(String[] args) throws IOException {
		
		char letra;
		int tecla = 0;
		System.out.print(">");
		letra = (char)System.in.read();
		
		while (letra != '\r') { 
			System.out.print(letra);
			letra = (char)System.in.read();
			tecla ++;
		}
		
		System.out.println("\nTeclas pulsadas: "+ tecla);
	}

}
