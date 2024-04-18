package compilador26_34;

import java.util.Scanner;

public class compi30 {

	public static void main(String[] args) {

		int valor = 1, num = 0, lista1 = 0, lista2 = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("PRIMERA Lista");
		while (valor <= 4) {
			System.out.print("Dame valor " + valor + ": ");
			valor = valor + 1;
			num = teclado.nextInt();
			lista1 = lista1 + num;
		}
		valor = 1;
		teclado.nextLine();
		System.out.println("SEGUNDA Lista");
		while (valor <= 4) {
			System.out.print("Dame valor " + valor + ": ");
			valor = valor + 1;
			num = teclado.nextInt();
			lista2 = lista2 + num;

		}
		teclado.nextLine();
		System.out.println("TOTAL Lista 1: " + lista1);
		System.out.println("TOTAL Lista 2: " + lista2);
		if (lista1 < lista2) {
			System.out.println("Lista 2 MAYOR");
		} else if (lista1 > lista2) {
			System.out.println("Lista 1 MAYOR");
		} else
			System.out.println("Listas IGUALES");
		teclado.close();
	}

}
