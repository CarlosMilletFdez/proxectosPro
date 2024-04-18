package pizarra15_22;

import java.util.Scanner;

public class piza15 {

	public static void main(String[] args) {
		int A, B;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame un número A: ");
		A = teclado.nextInt();
		System.out.print("Dame un número B: ");
		B = teclado.nextInt();
		if (A > B) {
			System.out.println(A + " é MAIOR que " + B);
		} else if (A < B) {
			System.out.println(A + " é MENOR que " + B);
		} else if (A == B) {
			System.out.println(A + " é IGUAL que " + B);
		}
		teclado.close();
	}

}
