package teoria.capitulo02.ordenador;

public class CRacional {

	int Numerador, Denominador;
	
	void AsignarDatos(int num, int den) {
		Numerador = num;
		if (den==0) den=1;
		Denominador = den;
	}
	void VisualizarRacional() {
		System.out.println("Racional-1: " + Numerador + "/" + Denominador);
	}
	
	public static void main (String [] args) {
		CRacional r1 = new CRacional();
		r1.AsignarDatos(2,5);
		r1.VisualizarRacional();
		
	}
}
