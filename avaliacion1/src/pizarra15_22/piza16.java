package pizarra15_22;

import java.util.Scanner;

public class piza16 {

	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe unha idade en anos: ");
		idade = teclado.nextInt();
		if (idade >= 0 && idade <= 17) {
			System.out.println("MENOR de idade con " + idade + " anos");
			System.out.println("PROHIBIDO pasar á sala de cine");
		} else if (idade >= 18 && idade <= 110) {
			System.out.println("MAIOR de idade con " + idade + " anos");
			System.out.println("PASE á sala de cine");
		} else if (idade > 110) {
			System.out.println("Ter " + idade + " anos non esta CONTEMPLADO");
			System.out.println("PECHEN a sala de cine");
		}
		teclado.close();
	}

}
