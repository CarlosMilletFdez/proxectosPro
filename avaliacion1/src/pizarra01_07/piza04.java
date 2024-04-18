package pizarra01_07;

import java.util.Scanner;

public class piza04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valor , tope=20 ;
		
		System.out.println("Dame un numero menor que 20: ");
		valor = teclado.nextInt();
		
		while (valor < tope) {
			
			System.out.println(tope);
			tope--; 
		}

		teclado.close();
	}

}
