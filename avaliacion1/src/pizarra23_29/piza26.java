package pizarra23_29;

import java.util.Scanner;

public class piza26 {

	public static void main(String[] ar) {
		Scanner teclado = new Scanner(System.in);
		int f1 = 1, f2 = 0;

		while (f1 <= 10) {

			System.out.println("Taboa do " + f1 + ": ");
			f2 = 1;

			while (f2 <= 10) {

				System.out.println(f1 + " x " + f2 + " = " + f1 * f2);
				f2 = f2 + 1;
			}

			f1 = f1 + 1;

			teclado.nextLine();

		}
		teclado.close();
	}

}
