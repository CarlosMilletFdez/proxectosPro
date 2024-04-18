package compilador09_16;

import java.util.Scanner;

public class compi12 {
	
	public static void main (String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese primer valor: ");
		int num1 = teclado.nextInt(); 
		
		System.out.print("Ingrese segundo valor: ");
		int num2 = teclado.nextInt();
		
		if (num1 > num2) {
			System.out.println("La suma --------------> " + (num1 + num2));	
			System.out.println("La diferencia --------> " + (num1 - num2));
			}
		
		else {
			System.out.println("El producto ----------> " + (num1 * num2));
			System.out.println("La division(entera) --> " + (num2 / num1));
			}
		
		teclado.close();
	}
}
