package teoria.capitulo10;

import misClases.teoria.CBanco;
import misClases.teoria.CCuenta;
import misClases.utilidades.Leer;

public class CApBanco {
	
	public static CCuenta leerDatos(int op) {
		
		CCuenta obj= null;
		String nombre, cuenta;
		double saldo, tipoi, mant;
		System.out.print("Nombre................: ");
	}
	
	public static int men�() {
		System.out.print("\n\n");
		System.out.println("1. Saldo");
		System.out.println("2. Buscar sigiente");
		System.out.println("3. Ingreso");
		System.out.println("4. Reintegro");
		System.out.println("5. A�adir");
		System.out.println("6. Eliminar");
		System.out.println("7. Mantenimiento");
		System.out.println("8. Mostrar");
		System.out.println("9. Salir");
		System.out.println();
		System.out.print("   Opci�n: ");
		int op;
		do
			op=Leer.datoInt();
		while(op<1||op>8);
		return op;
		
	}
	
	public static void main(String[] args) {
		
		CBanco banco = new CBanco();

		do {
			opci�n = men�();
		}
		

	}

}
