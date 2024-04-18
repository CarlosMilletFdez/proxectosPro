package misClases.teoria;

public class CRacional {

	private int Numerador, Denominador;
	
	public void AsignarDatos(int num, int den) {
		Numerador = num;
		if (den==0) den=1;
		Denominador = den;
	}
	public void VisualizarRacional() {
		System.out.println("Racional-1: " + Numerador + "/" + Denominador);
	}
	
	public static void main (String [] args) {
		CRacional rl = new CRacional();
		rl.AsignarDatos(2,5);
		rl.VisualizarRacional();
		
	}
}
