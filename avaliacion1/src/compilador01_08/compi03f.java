package compilador01_08;

import java.util.Scanner;

public class compi03f {
	
	public static void main (String[]args) {
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Dame a base: ");
		float base= teclado.nextFloat();
		
		System.out.print("Dame a altura: ");
		float altura= teclado.nextFloat();
		
		float area= (base*altura)/2f;
		System.out.print("Area do triangulo: " + area);
		
		teclado.close();

	}

}