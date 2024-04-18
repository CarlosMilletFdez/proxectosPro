package preparatorios08_16;

import java.util.Scanner;

public class prepara15 {

	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame idade: ");
		idade = teclado.nextInt();

		while (idade >= 1 && idade <= 9 || idade >= 15 && idade <= 29 || idade >= 65 && idade <= 110) {

			if (idade <= 9) {
				System.out.println("-> ESTE CATIVO TEN " + idade + " ANOS");
			} 
			
			else if (idade >= 15 && idade <= 29)
				System.out.println("-> ESTE XOVEN TEN " + idade + " ANOS");

			else {
				System.out.println("-> ESTE ANCIÁN TEN " + idade + " ANOS");
			}

			System.out.print("Dame idade: ");
			idade = teclado.nextInt();

		}

		System.out.println("+++++> Idade NON permitida");
		teclado.close();
	}

}
