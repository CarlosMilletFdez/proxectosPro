package compilador201_202;

import misClases.avaliacion2.CDameDato;

public class compi202 {

	public static void main(String[] args) {
		
		int opcionSeleccionada;
		CDameDato dameDato = new CDameDato();

		do {
			
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
				
			case 4:
				
				System.out.println("FINAL");
				
				break;
				
			default: 
				
				System.out.println("OPCION Erronea");
				
				break;
			}
		}

		while (opcionSeleccionada != 4);

	}

}
