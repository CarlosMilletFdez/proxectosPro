package compilador201_202;

import misClases.avaliacion2.CDameDato;

public class compi201 {

	public static void main(String[] args) {
		
		CDameDato dameDato = new CDameDato();

		int opcionSeleccionada = dameDato.seleccionaOpcion();
		
		while (opcionSeleccionada != 4) {
			
			opcionSeleccionada = dameDato.seleccionaOpcion();
			
			switch (opcionSeleccionada) {

			case 1:
				
				dameDato.recollerDatoInt();
				dameDato.amosarDatoInt();

				break;

			case 2:

				dameDato.recollerDatoFloat();
				dameDato.amosarDatoFloat();
				
				break;

			case 3:
				
				dameDato.recollerCadea();
				dameDato.amosarCadea();

				break;

			default:
				
				System.out.println("OPCION Erronea");
				break;
		
			}
			
			opcionSeleccionada = dameDato.seleccionaOpcion();
		}
			System.out.println("FINAL");
	}

}
