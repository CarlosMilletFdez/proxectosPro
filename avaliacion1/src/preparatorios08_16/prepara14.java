package preparatorios08_16;

import java.util.Scanner;

public class prepara14 {

	public static void main(String[] args) {

		int idade;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame idade: ");
		idade = teclado.nextInt();

		while (idade < 1 || idade > 9 && idade < 65 || idade > 110) {

			System.out.println("-> INCORRECTO, pusaches esta idade: " + idade);
			System.out.print("Dame idade: ");
			idade = teclado.nextInt();
		}

		if (idade <= 9) {
			System.out.println("+++++> ESTE CATIVO TEN " + idade + " ANOS");
		}

		else {
			System.out.println("+++++> ESTE ANCIÁN TEN " + idade + " ANOS");
		}
		
		teclado.close();
	}

}
