package compilador26_34;

import java.util.Scanner;

public class compi33 {

	public static void main(String[] args) {
		int suma = 0, cont = 1, valor;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese valor "+ cont + ": " );
		valor = teclado.nextInt();
		for (cont = 2; cont <= 6; cont++) {
			System.out.print("Ingrese valor "+ cont + ": ");
			valor = teclado.nextInt();
			if (cont>=4) {
				suma = suma + valor;
			}
		}
		System.out.println("La suma de los 3 ultimos valores es: " + suma);
		
		teclado.close();
	}
		
}
