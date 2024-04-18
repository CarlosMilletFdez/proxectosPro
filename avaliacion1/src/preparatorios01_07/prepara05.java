package preparatorios01_07;

import java.util.Scanner;

public class prepara05 {

	public static void main(String[] args) {

		int idade = 0, cont17 = 0, cont12 = 0, cont65 = 0, cont40 = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame IDADE: ");
		idade = teclado.nextInt();

		while (idade >= 3 && idade <= 17 || idade >= 25 && idade <= 65) {

			System.out.print("CORRECTO, idade pulsada: " + idade + " -> modificado este intervalo: ");
			
			
			if (idade <= 17) {
				cont17 = cont17 + 1;
				System.out.print("(3,17)");

				if (idade >= 9 && idade <= 12) {
					cont12 = cont12 + 1;
					System.out.print("(9,12)");
				}
			}

			else {
				cont65 = cont65 + 1;
				System.out.print("(25,65)");

				if (idade >= 35 && idade <= 40) {
					cont40 = cont40 + 1;
					System.out.print("(35,40)");
				}
			}

			System.out.print("\nDame IDADE: ");
			idade = teclado.nextInt();
		}

		System.out.println("+++++> Entre 3 e 17 pulsaronse " + cont17 + " idades");
		System.out.println("+++++> Entre 9 e 12 pulsaronse " + cont12 + " idades");
		System.out.println("+++++> Entre 25 e 65 pulsaronse " + cont65 + " idades");
		System.out.println("+++++> Entre 35 e 40 pulsaronse " + cont40 + " idades");
		teclado.close();
	}

}
