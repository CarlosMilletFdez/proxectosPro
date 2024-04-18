package misClases.avaliacion2;

import java.util.Scanner;

public class CVectorAleatorio {

	int n = 10;
	private int[] vector = new int[n];

	private Scanner teclado = new Scanner(System.in);

	private void amosarMenu() {

		System.out.println("\nMENU");
		System.out.println("======");
		System.out.println("1.- INICIALIZA Vector aleatoriamente");
		System.out.println("2.- AMOSA Vector");
		System.out.println("3.- ORDENA Ascendentemente");
		System.out.println("4.- ORDENA Descendentemente");
		System.out.println("5.- FINAL");
	}

	public int seleccionaOpcion() {

		int opcion;
		amosarMenu();
		opcion = teclado.nextInt();

		return opcion;

	}

	public void iniciarVector() {

		for (int i = 0; i < vector.length; i++)
			vector[i] = (int) ((90 - 30 + 1) * Math.random() + 30);
	}
	// math.random()*(limsup- liminf+ 1)+30 para sacar numeros aleatorios entre 30 y
	// 90 y pasarlo a int porque el random devuelve un double

	public void amosarVector() {

		int i;
		System.out.println("VECTOR DE Enteiros");
		System.out.println("==================");

		for (i = 0; i < n; i++) {

			System.out.print(" " + i + "\t");

		}
		
		System.out.println(" ");

		for (i = 0; i < n; i++) {

			System.out.print(vector[i] + "\t");
		}
	}

	public void ordenaAscendente() {

		int dato;
		for (int i = 1; i <= vector.length - 1; i++) {
			for (int j = vector.length - 1; j >= i; j--) {
				if (vector[j - 1] > vector[j]) {
					dato = vector[j - 1];
					vector[j - 1] = vector[j];
					vector[j] = dato;

				}
			}
		}
	}

	public void ordenaDescendente() {

		int dato;
		for (int i = 1; i <= vector.length - 1; i++) {
			for (int j = vector.length - 1; j >= i; j--) {
				if (vector[j - 1] < vector[j]) {
					dato = vector[j - 1];
					vector[j - 1] = vector[j];
					vector[j] = dato;

				}
			}
		}
	}

}
