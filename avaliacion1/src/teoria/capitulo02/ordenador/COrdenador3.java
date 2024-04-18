package teoria.capitulo02.ordenador;

public class COrdenador3 {
	
	String Marca;
	String Procesador;
	String Pantalla;
	
	boolean OrdenadorEncendido;
	boolean Presentacion;
	
	void EncenderOrdenador() {

		if (OrdenadorEncendido == true) {
			System.out.println("========================================");
			System.out.println("El ordenador3 ya esta encendido.");
			System.out.println("========================================");
		}
		else {
			OrdenadorEncendido = true;
			System.out.println("========================================");
			System.out.println("El ordenador3 se ha encendido.");
			System.out.println("========================================");
		}
	}
	void Estado() {
		System.out.println("Estado del ordenador3: " + "\n- Marca: " + Marca + "\n- Procesador: " + Procesador + "\n- Pantalla: " + Pantalla);
		if (OrdenadorEncendido == true) {
			System.out.println("El ordenador3 esta encendido.");
		}
		else 
			System.out.println("El ordenador3 esta apagado.");
	}
	void ApagarOrdenador() {
		OrdenadorEncendido = false; 
			System.out.println("========================================");
			System.out.println("El ordenador3 se ha apagado.");
			System.out.println("========================================");
	}
	
}
