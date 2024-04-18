package compilador203_205;

import misClases.avaliacion2.CVector;

public class compi203 {

	public static void main(String[] args) {
		
		int opcionSeleccionada;
		CVector arrayVector = new CVector();

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
				
				System.out.println("Opcion NO Implementada");

				break;
				
			case 4:
				
				System.out.println("Opcion NO Implementada");
				
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
		

	}
}
