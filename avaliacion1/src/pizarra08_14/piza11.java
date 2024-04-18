package pizarra08_14;

import java.util.Scanner;

public class piza11 {
	public static void main(String[] args) {
		int numero, numerodado;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduza un número menor de 20: ");
		numero = teclado.nextInt();
		for (numerodado = 20;numerodado >= numero; numerodado = numerodado - 1) //no se cierra el teclado si meto un numero mayor de 20 porque nunca pasa del for
			System.out.println(numerodado);
		
		teclado.close();	
	}
	
	
}
