package pizarra224_232;

import misClases.avaliacion2.CRecursivo;

public class piza230 {

	public static void main(String[] args) {

		CRecursivo recursivo = new CRecursivo();
		int a,b, suma;
		
		a=5;
		b=7;
		suma=recursivo.sumaA_B(a,b);
		System.out.print("Suma desde " + a + " hasta " + b + ": " + suma);
	}

}
