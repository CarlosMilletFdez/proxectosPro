package pizarra15_22;

import java.util.Scanner;

public class piza22 {

	public static void main(String[] args) {
		int a, b;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduza un número a: ");
		a = teclado.nextInt();
		System.out.println("Introduza un outro número b: ");
		b = teclado.nextInt();
		if (a < 0 && b < 0) {
			System.out.println("Os dous son NEGATIVOS");
		} else if (a < 0 && b > 0 || a > 0 && b < 0) {
			System.out.println("Un dos dous é NEGATIVO");
		} else {
			System.out.println("Os dous son POSITIVOS");
		}
		teclado.close();
	}

}
