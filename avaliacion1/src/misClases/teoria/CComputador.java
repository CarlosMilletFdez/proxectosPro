package misClases.teoria;

public class CComputador {

	private String Marca;
	private String Procesador;
	private String Pantalla;

	private boolean OrdenadorEncendido;
	// private boolean Presentación;

	private static byte Garantía;//la garantía se inicializa en 3 
									//antes siempre era 3 y no hace falta llamar a ningun metodo porque se inicializa con valor 3 y no se va a modificar
									//usando el metodo establecergarantia podemos asignar otro valor a garantia

	public void EncenderOrdenador() {

		if (OrdenadorEncendido == true) {
			System.out.println("========================================");
			System.out.println("El ordenador ya está encendido.");
			System.out.println("========================================");
		} else {
			OrdenadorEncendido = true;
			System.out.println("========================================");
			System.out.println("El ordenador se ha encendido.");
			System.out.println("========================================");
		}
	}

	public void Estado() {
		System.out.println("Estado del ordenador: " + "\n- Marca: " + Marca + "\n- Procesador: " + Procesador
				+ "\n- Pantalla: " + Pantalla + "\n- Garantía: " + Garantía);
		
		if (OrdenadorEncendido == true) {
			System.out.println("* El ordenador está encendido.");
		}
		else
			System.out.println("* El ordenador está apagado.");
	}

	public void ApagarOrdenador() {
		OrdenadorEncendido = false;
		System.out.println("========================================");
		System.out.println("El ordenador se ha apagado.");
		System.out.println("========================================");
	}

	public void modificar(String marca, String procesador, String pantalla/*, byte garantia*/) {
		this.Marca = marca;//this. es la forma de acceder a la instancia de la clase ccomputador en que estoy trabajando
		this.Procesador = procesador;
		this.Pantalla = pantalla;
		//CComputador.Garantía = garantia;//lo llama la clase porque es un atributo de la clase
		
	}
	
	public static void EstablecerGarantia(byte g) {
		
		Garantía= g; //aqui hago el cast a garantía ya que esta definida como un byte, el el metodo modificar en la clase capcomputador tenia q hacerlo cuando cada instancia llamaba al metodo modificar
		//CComputador.Garantía=3;
	}//no hace falta método porque la garantía siempre es 3 y se inicializa la variable Garantía con valor 3
	
}
