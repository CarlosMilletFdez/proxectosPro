package pizarra23_29;

import java.util.Scanner;

public class piza25 {

	public static void main(String[] args) {
		int num, cont1 = 0, cont2 = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduza un numero: ");
		num = teclado.nextInt();
		while (num >= 1 && num <= 100) {
			if (num <= 50) {
				cont1 = cont1 + 1;
			} else {
				cont2 = cont2 + 1;
			}
			System.out.print("Introduza outro numero: ");
			num = teclado.nextInt();
		}
		System.out.println("Entre 1 e 50 houbo " + cont1 + " numeros.");
		System.out.println("Entre 51 e 100 houbo " + cont2 + " numeros.");
		teclado.close();
	}
}