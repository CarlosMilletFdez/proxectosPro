package compilador17_25;

import java.util.Scanner;

public class compi21 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int cont, notasmas6, notasmenos6;
		cont = 1;
		notasmas6 = 0;
	    notasmenos6 = 0;

		while (cont < 8) {

			System.out.print("Dame nota " + cont + ": ");
			int nota = teclado.nextInt();
			cont = cont + 1;

			if (nota >= 6) {

				notasmas6 = notasmas6 + 1;
			} else {

				notasmenos6 = notasmenos6 + 1;

			}

		}

		System.out.println("Alumnos con nota mayor o igual que 6: " + notasmas6);
		System.out.println("Alumnos con nota menor que 6: " + notasmenos6);
	
		teclado.close();
	}	
		
	
}
