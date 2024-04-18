package compilador01_08;

import java.util.Scanner;

public class compi02 {
	
	public static void main (String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Dame a base: ");
		int base= teclado.nextInt();
		
		System.out.print("Dame altura: ");
		int altura= teclado.nextInt();
		
		int rectangulo= base * altura;
		System.out.print("Área do rectángulo: " + rectangulo);
	
		teclado.close();
	}
}
