package compilador09_16;

import java.util.Scanner;

public class compi16 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese un valor: ");
		int valor = teclado.nextInt();
		
		if (valor > 0) {
			
			System.out.print("POSITIVO");
			
		}
		
		else if (valor == 0) {
				
			System.out.print("NULO");
		}	
		else {
			
			System.out.print("NEGATIVO");
		
		}
		teclado.close();
		
		}	
	}


