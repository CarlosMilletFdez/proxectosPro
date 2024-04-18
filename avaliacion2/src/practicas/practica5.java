package practicas;

import misClases.avaliacion2.CArrayCaracteres;
import misClases.avaliacion2.CMatrices;
import misClases.avaliacion2.CString;
import misClases.teoria.Leer;


public class practica5 {

	public static void main(String[] args) {
	
		CMatrices matriz = new CMatrices();
		CArrayCaracteres acar = new CArrayCaracteres();
		CString string = new CString();
		int opcionSeleccionada;
		
		
		do {
			opcionSeleccionada = dameOpcion();
			
			switch (opcionSeleccionada) {

			case 1:

				matriz.recolle();
				matriz.amosa('A', 'B');
				matriz.trasposta('A', 'C');
				matriz.trasposta('B','D');
				matriz.amosa('C', 'D');
				matriz.suma('A', 'B', 'C');
				matriz.resta('A', 'B', 'D');
				matriz.amosa('C', 'D');
				matriz.resta('B', 'A', 'C');
				matriz.multiplica('A', 'B', 'D');
				matriz.amosa('C', 'D');

				break;

			case 2:
				
				acar.recolle();
				acar.amosa();
				acar.maiusculas();
				acar.minusculas();
				acar.arroba();
				acar.espacioBlanco();
				acar.sinNumeros();
				acar.amosa();

				break;

			case 3:

				string.recolle();
				string.amosa();
				string.maiusculas();
				string.arroba();
				string.espacioBlanco();
				string.sinNumeros();
				string.amosa();
				
				break;

			case 4:

				System.out.println("FINAL");
				break;

			default:
				System.out.println("OPCION Erronea");

			}
		}

		while (opcionSeleccionada != 4);

	}

	static void menu() {

		System.out.println(" ");
		System.out.println("1.- Matrices ");
		System.out.println("2.- Array de caracteres ");
		System.out.println("3.- String ");
		System.out.println("4.- Sair ");
		System.out.println();
		System.out.print("Introduce unha opción: ");

		
	}

	static int dameOpcion() {
		
		menu();
		int opcion = Leer.datoInt();
		return opcion;

	}

}
