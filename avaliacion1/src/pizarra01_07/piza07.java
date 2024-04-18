package pizarra01_07;

import java.util.Scanner;

public class piza07 {

	public static void main(String[] args) {

		int f1, f2;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduza un número: ");
		f1 = teclado.nextInt();
		System.out.println("Taboa de multiplicar do " + f1);
		f2 = 1;

		while (f2 <= 10) {
			System.out.println(f1 + " * " + f2 + " = " + f1 * f2);
			f2 = f2 + 1;
		}

		teclado.close();
	}

}
