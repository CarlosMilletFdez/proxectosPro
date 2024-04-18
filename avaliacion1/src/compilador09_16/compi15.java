package compilador09_16;

import java.util.Scanner;

public class compi15 {

	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame primer valor: ");
		int num1 = teclado.nextInt(); 
		
		System.out.print("Dame segundo valor: ");
		int num2 = teclado.nextInt(); 
		
		System.out.print("Dame tercer valor: ");
		int num3 = teclado.nextInt(); 
		
		if ( num1 > num2 &&  num1 > num3 ) {
			
			System.out.print("El mayor ---> " + num1);	
		}
		
		else if (num2 > num1 && num2 > num3) {
			
			System.out.print("El mayor ---> " + num2);
		}
		
		else {
			
			System.out.print("El mayor ---> " + num3);
			
		teclado.close();
		
		}
	}

}
