package pizarra23_29;

import java.util.Scanner;

public class piza24 {

	public static void main(String[] args) {
		int num, cont = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduza un numero entre 10 e 50: ");
		num = teclado.nextInt();
		while (num >= 10 && num <= 50) {
			if (num % 3 == 0) {
				cont = cont + 1;
			}
			System.out.print("Introduza outro numero: ");
			num = teclado.nextInt();
		}
		System.out.println("Has introducido " + cont + " multiplos de 3 entre 10 e 50.");
		teclado.close();
	}

}
