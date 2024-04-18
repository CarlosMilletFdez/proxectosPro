package compilador01_08;

import java.util.Scanner;

public class compi02f {
	
	public static void main (String[] args) {
		
	Scanner teclado= new Scanner(System.in);
	
	System.out.print("Dame a base: ");
	float base= teclado.nextFloat();
	
	System.out.print("Dame a altura: ");
	float altura= teclado.nextFloat();
	
	System.out.print("Area do rectangulo: " + base*altura);
	
	teclado.close();
	}
}
