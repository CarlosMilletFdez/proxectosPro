package misClases.teoria;

public class CIntereses {

	private double capital, intereses;
	private float tipo;
	private int dias;
	
	public void recolleDatos() {
		
		System.out.print("Capital invertido: ");
		capital = Leer.datoDouble();
		System.out.print("A un tipo(%) anual del: ");
		tipo = Leer.datoFloat();
		System.out.print("Durante cuantos días: ");
		dias = Leer.datoInt();
		realizaCalculos();
	}
	
	private void realizaCalculos() {
		intereses = (capital * tipo * dias)/(360*100);
	}
	
	public void muestraInformacion() {
		
		System.out.println("\nIntereses producidos..."+ intereses);
		System.out.println("Capital acumulado......" + (capital+intereses));
	
	}
}
