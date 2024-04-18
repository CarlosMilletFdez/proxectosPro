package teoria.capitulo02.ordenador;

public class CRacional3 {

	int Numerador, Denominador;
	
	void AsignarDatos(int num, int den) {
		Numerador = num;
		if (den==0) den=1;
		Denominador = den;
	}
	void VisualizarRacional() {
		System.out.println("Racional-3: " + Numerador + "/" + Denominador);
	}
	
	
}