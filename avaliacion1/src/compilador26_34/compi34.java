package compilador26_34;

import java.util.Scanner;

public class compi34 {

	public static void main(String[] args) {
		int valor, cont, negativos = 0, positivos = 0, multiplos = 0, pares = 0;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		for (cont = 1; cont <= 8; cont++) {
			System.out.print("Ingrese valor " + cont + ": ");
			valor = teclado.nextInt();
			
			if (valor < 0)
				negativos = negativos + 1;
			
			else if (valor > 0)
				positivos = positivos + 1;

			if (valor % 5 == 0)
				multiplos = multiplos + 1;

			if (valor % 2 == 0)
				pares = pares + valor;

		}
		System.out.println("Cantidad de valores negativos: " + negativos);
		System.out.println("Cantidad de valores positivos: " + positivos);
		System.out.println("Cantidad de valores multiplos de 5: " + multiplos);
		System.out.println("Suma de valores pares: " + pares);

		teclado.close();
	}
}
