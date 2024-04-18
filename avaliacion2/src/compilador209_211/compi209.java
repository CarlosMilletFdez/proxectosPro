package compilador209_211;

import java.util.Scanner;

import misClases.avaliacion2.CArrayCadenas;

public class compi209 {

	public static void main(String[] args) {
		
		CArrayCadenas semana = new CArrayCadenas();
		int opcion;
		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("\nMENU");
			System.out.println("=======");
			System.out.println("1.-INICIALIZA Array de Cadenas");
			System.out.println("2.-AMOSA Array");
			System.out.println("3.-ORDENA Ascendentemente");
			System.out.println("4.-ORDENA Descendentemente");
			System.out.println("5.-FINAL");
			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:
				
				semana.inicializa();
				break;

			case 2:
				semana.amosaArray();
				break;

			case 3:
				
				System.out.print("Opción NO Implementada.");

				break;

			case 4:
				System.out.println("Opción NO Implementada.");
				break;
				
			case 5:
				System.out.println("FINAL");
				break;

			default:
				System.out.println("OPCION Erronea");
				break;
			}
		}

		while (opcion != 5);

		teclado.close();
	}

}


