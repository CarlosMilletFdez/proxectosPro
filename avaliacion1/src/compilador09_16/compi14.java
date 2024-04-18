package compilador09_16;

import java.util.Scanner;

public class compi14 {

	static public void main (String[] args) {
			
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame un entero entre 1 y 99: ");
		int num = teclado.nextInt(); 
		
		if ( num < 10 ) {
			
			System.out.println("Tiene UN digito");
		}
		
		else {
			
			System.out.println("Tiene DOS digitos");
		}
		
		teclado.close();
	}
		
}
