package teoria.capitulo02.ordenador;

public class CApOrdenador2 {

	public static void main(String[] args) {
		COrdenador2 MiOrdenador = new COrdenador2();
		MiOrdenador.Marca = "Ast";
		MiOrdenador.Procesador = "Intel Pentium";
		MiOrdenador.Pantalla = "TFT";
		MiOrdenador.EncenderOrdenador();
		MiOrdenador.Estado();
		MiOrdenador.ApagarOrdenador();
		MiOrdenador.Estado();
	}
}

class COrdenador2 {
	
	String Marca;
	String Procesador;
	String Pantalla;
	
	boolean OrdenadorEncendido;
	boolean Presentacion;
	
	void EncenderOrdenador() {

		if (OrdenadorEncendido == true) {
			System.out.println("========================================");
			System.out.println("El ordenador2 ya está encendido.");
			System.out.println("========================================");
		}
		else {
			OrdenadorEncendido = true;
			System.out.println("========================================");
			System.out.println("El ordenador2 se ha encendido.");
			System.out.println("========================================");
		}
	}
	void Estado() {
		System.out.println("Estado del ordenador2: " + "\n- Marca: " + Marca + "\n- Procesador: " + Procesador + "\n- Pantalla: " + Pantalla);
		if (OrdenadorEncendido == true) {
			System.out.println("El ordenador2 está encendido.");
		}
		else 
			System.out.println("El ordenador2 está apagado.");
	}
	void ApagarOrdenador() {
		OrdenadorEncendido = false; 
			System.out.println("========================================");
			System.out.println("El ordenador2 se ha apagado.");
			System.out.println("========================================");
	}
	
}