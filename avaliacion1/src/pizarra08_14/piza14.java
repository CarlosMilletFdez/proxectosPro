package pizarra08_14;

import java.util.Scanner;

public class piza14 {

	public static void main(String[] args) {
		int f1, f2;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduza un número do 1 o 10:");
		f1 = teclado.nextInt();
		for (f2 = 1; f2<=10; f2++)
			System.out.println(f1 + " * " + f2 + " = " + f1*f2);
		teclado.close();
	}
	
}
