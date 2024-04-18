package pizarra224_232;

import misClases.avaliacion2.CRecursivo;

public class piza228 {

	public static void main(String[] args) {
		
		CRecursivo recursivo = new CRecursivo();
		long n, facto;
		
		n= 6;
		facto = recursivo.factorial(n);
		System.out.println("Factorial de " + n + " es " + facto);

	}

}
