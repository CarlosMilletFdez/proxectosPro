package compilador308_309;

import java.io.File;

import misClases.avaliacion3.Fichero;

public class compi309 {

	public static void main(String[] args) {
		
		
		
		Fichero ficheroE = new Fichero();
		Fichero ficheroS = new Fichero();
		ficheroE.asignaFicheroLectura();
		ficheroS.asignaFicheroEscritura();
		ficheroE.copia(ficheroS);

		// son los metodos del 307 pero en la clase fichero

	}

}
