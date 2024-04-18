package preparatorios08_16;

import java.util.Scanner;

public class prepara08 {

	public static void main(String[] args) {

		int idade = 0, cont40_60 = 0, cont30_45 = 0, cont25_35 = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame IDADE: ");
		idade = teclado.nextInt();

		while (idade >= 25 && idade <= 60) {

			System.out.print("CORRECTO, idade pulsada: " + idade + " -> modificado este intervalo:");

			if (idade >= 25 && idade <= 35) {
				cont25_35 = cont25_35 + 1;
				System.out.print("(25,35)");

			}

			if (idade >= 30 && idade <= 45) {
				cont30_45 = cont30_45 + 1;
				System.out.print("(30,45)");

			}

			if (idade >= 40 && idade <= 60) {
				cont40_60 = cont40_60 + 1;
				System.out.print("(40,60)");
			}

			System.out.print("\nDame IDADE: ");
			idade = teclado.nextInt();
		}

		System.out.println("+++++> Entre 25 e 35 pulsaronse " + cont25_35 + " idades");
		System.out.println("+++++> Entre 30 e 45 pulsaronse " + cont30_45 + " idades");
		System.out.println("+++++> Entre 40 e 60 pulsaronse " + cont40_60 + " idades");

		teclado.close();
	}

}
