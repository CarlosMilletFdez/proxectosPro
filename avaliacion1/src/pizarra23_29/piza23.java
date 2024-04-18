package pizarra23_29;

import java.util.Scanner;

public class piza23 {

	public static void main(String[] args) {

		int num;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduza un numero: ");
		num = teclado.nextInt();

		while (num >= 10 && num <= 50) {
			System.out.println("Introduza outro numero: ");
			num = teclado.nextInt();
		}

		System.out.println("O numero " + num + " non esta entre 10 e 50.");

		teclado.close();
	}
}
