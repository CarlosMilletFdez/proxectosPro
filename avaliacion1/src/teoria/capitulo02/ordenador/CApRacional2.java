package teoria.capitulo02.ordenador;

public class CApRacional2 {

		public static void main (String [] args) {
			CRacional2 r2 = new CRacional2();
			r2.AsignarDatos(2,5);
			r2.VisualizarRacional();			
	}
}

class CRacional2{
	int Numerador, Denominador;
	
	public void AsignarDatos(int num, int den) {
		Numerador = num;
		if (den==0) den=1;
		Denominador = den;
	}
	public void VisualizarRacional() {
		System.out.println("Racional-2: " + Numerador + "/" + Denominador);
	}
	
}