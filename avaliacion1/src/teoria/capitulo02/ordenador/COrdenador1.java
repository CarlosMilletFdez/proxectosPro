package teoria.capitulo02.ordenador;

public class COrdenador1 {

	String Marca;
	String Procesador;
	String Pantalla;
	
	boolean OrdenadorEncendido;
	boolean Presentacion;

	void EncenderOrdenador() {

		if (OrdenadorEncendido == true)
			System.out.println("El ordenador1 ya estÃ¡ encendido.");
		else {
			OrdenadorEncendido = true;
			System.out.println("El ordenador1 se ha encendido.");
		}

	}

	void Estado() {
		System.out.println("Estado del ordenador1: " + "\n- Marca: " + Marca + "\n- Procesador: " + Procesador + "\n- Pantalla: " + Pantalla);
		if (OrdenadorEncendido == true) 
			System.out.println("El ordenador1 esta encendido.");
		else
			System.out.println("El ordenador1 esta apagado.");
	}

	public static void main(String[] args) {
		COrdenador1 MiOrdenador = new COrdenador1();
		MiOrdenador.Marca = "Ast";
		MiOrdenador.Procesador = "Intel Pentium";
		MiOrdenador.Pantalla = "TFT";
		System.out.println("========================================");
		MiOrdenador.EncenderOrdenador();
		System.out.println("========================================");
		MiOrdenador.Estado();
	}

}
