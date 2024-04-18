package compilador26_34;

import java.util.Scanner;

public class compi31 {

	public static void main(String[] args) {
		int pares = 0, impares = 0, num, valor = 1, dato;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Cuantos numeros: ");
		num = teclado.nextInt();
		while (valor <= num) {
			System.out.print("Dame valor " + valor + ": ");
			dato = teclado.nextInt();
			valor = valor + 1;
			if (dato % 2 == 0) 
				pares = pares + 1;
			else
				impares = impares + 1;
		}
		System.out.println("Cantidad de pares: " + pares);
		System.out.println("Cantidad de impares: " + impares);
		teclado.close();
	}

}
