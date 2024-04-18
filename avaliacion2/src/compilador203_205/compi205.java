package compilador203_205;

import java.util.Scanner;

import misClases.avaliacion2.CVector;

public class compi205 {

	public static void main(String[] args) {

		int opcionSeleccionada, enteiro;
		CVector arrayVector = new CVector();
		Scanner teclado= new Scanner(System.in);

		do {

			opcionSeleccionada = arrayVector.seleccionaOpcion();

			switch (opcionSeleccionada) {

			case 1:

				System.out.println("Vector INICIALIZADO");
				arrayVector.iniciarVector();

				break;

			case 2:

				arrayVector.amosarVector();

				break;

			case 3:

				System.out.print("Introduza número enteiro: ");
				enteiro = teclado.nextInt();
				
				arrayVector.insertarEnteiro(enteiro);

				break;

			case 4:
				
				System.out.println("Elimine número enteiro: ");
				enteiro = teclado.nextInt();
				
				arrayVector.eliminarEnteiro(enteiro);

				break;

			case 5:

				System.out.println("FINAL");

				break;

			default:

				System.out.println("OPCION Erronea");

				break;

			}
		} 
		
		while (opcionSeleccionada != 5);
		teclado.close();
	}


}


