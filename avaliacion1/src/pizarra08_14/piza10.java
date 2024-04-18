package pizarra08_14;

import java.util.Scanner;

public class piza10 {

	public static void main(String[] args) {
		int num;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduza un numero menor de 20: ");
		num = teclado.nextInt();

		for (; num <= 20; num = num + 1) 
			System.out.println(num);
		
	teclado.close();		
	}
	
}