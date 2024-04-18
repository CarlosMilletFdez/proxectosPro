package teoria.capitulo09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import misClases.teoria.CListaTfnos;
import misClases.teoria.CPersona;
import misClases.teoria.Leer;

public class CApListaTfnos {

	public static int menú() {

		System.out.print("\n");
		System.out.println("1. Buscar");
		System.out.println("2. Buscar siguiente");
		System.out.println("3. Añadir");
		System.out.println("4. Eliminar");
		System.out.println("5. Mostrar");
		System.out.println("6. Salir");
		System.out.println();
		System.out.print("   Opcion: ");
		int op;
		do
			op = Leer.datoInt();
		while (op < 1 || op > 6);
		return op;
	}

	public static void main(String[] args) {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader flujoE = new BufferedReader(isr);
		PrintStream flujoS = System.out;

		CListaTfnos listatfnos = new CListaTfnos();
		int opcion = 0, pos = -1;
		String cadenabuscar = null;
		String nombre, direccion;
		long telefono;
		boolean eliminado = false;

		do {
			try {
				opcion = menú();
				switch (opcion) {

				case 1:

					flujoS.print("Conjunto de caracteres a buscar: ");
					cadenabuscar = flujoE.readLine();
					pos = listatfnos.buscar(cadenabuscar, 0);
					if (pos == -1)
						if (listatfnos.longitud() != 0)
							flujoS.println("búsqueda fallida");
						else
							flujoS.println("lista vacía");
					else {
						flujoS.println(listatfnos.valorEn(pos).obtenerNombre());
						flujoS.println(listatfnos.valorEn(pos).obtenerDirección());
						flujoS.println(listatfnos.valorEn(pos).obtenerTeléfono());
					}
					break;

				case 2:

					pos = listatfnos.buscar(cadenabuscar, pos + 1);
					if (pos == -1)
						if (listatfnos.longitud() != 0)
							flujoS.println("búsqueda fallida");
						else
							flujoS.println("lista vacía");
					else {
						flujoS.println('\n'+listatfnos.valorEn(pos).obtenerNombre());
						flujoS.println(listatfnos.valorEn(pos).obtenerDirección());
						flujoS.println(listatfnos.valorEn(pos).obtenerTeléfono());
					}
					break;

				case 3:

					flujoS.print("\nnombre: ");
					nombre = flujoE.readLine();
					flujoS.print("dirección: ");
					direccion = flujoE.readLine();
					flujoS.print("telefono: ");
					telefono = Leer.datoLong();
					listatfnos.añadir(new CPersona(nombre, direccion, telefono));
					break;

				case 4:

					flujoS.print("teléfono: ");
					telefono = Leer.datoLong();
					eliminado = listatfnos.eliminar(telefono);
					if (eliminado)
						flujoS.println("registro eliminado");
					else if (listatfnos.longitud() != 0)
						flujoS.println("telefono no encontrado");
					else
						flujoS.println("lista vacía");
					break;

				case 5:

					listatfnos.mostrarListaTfnos();
					break;

				case 6:

					listatfnos = null;
				}
			}

			catch (IOException ignorada) {

			}
		} 
		
		while (opcion != 6);

	}

}
