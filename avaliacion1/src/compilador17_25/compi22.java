package compilador17_25;

import java.util.Scanner;

public class compi22 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numalumnos, cont;
		cont = 0;
		float sumalturas = 0;
		System.out.print("Cuantos alumnos hay: ");
		numalumnos = teclado.nextInt();

		while (cont < numalumnos) {
			cont = cont + 1;
			System.out.print("Dame altura " + cont + ": ");
			float altura = teclado.nextFloat();
			sumalturas = sumalturas + altura;
			
		}	
		System.out.print("Altura promedio: " + sumalturas/numalumnos);

		teclado.close();
	}

}
