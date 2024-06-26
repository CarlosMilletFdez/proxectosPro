package misClases.avaliacion2;

import java.io.IOException;

public class CRecursivo {

	private char[] cadena = new char[40];
	private int[] vector = { 1, 3, 6, 2, 8, 7 };

	public void amosa1_N(int i) {// 224

		if (i > 1) {

			amosa1_N(i - 1);
		}

		System.out.print(" " + i);
	}

	public void amosaN_1(int i) {// 225

		System.out.print(" " + i);

		if (i > 1)

			amosaN_1(i - 1);

	}

	public void amosaA_B(int a, int b) {// 226

		System.out.print(a + " ");

		if (a < b)
			amosaA_B(a + 1, b);

	}

	public void amosaB_A(int a, int b) {// 227

		System.out.print(" " + b);
		if (b > a)
			amosaB_A(a, b - 1);

	}

	public long factorial(long n) {// 228

		long facto;
		if (n > 1)
			facto = n * factorial(n - 1);
		else
			facto = 1;

		return facto;
	}

	public int suma1_N(int n) {// 229

		int suma;
		if (n == 1)
			suma = n;
		else
			suma = n + suma1_N(n - 1);

		return suma;
	}

	public int sumaA_B(int a, int b) {// 230

		int dato;

		if (a == b)
			dato = a;
		else
			dato = a + sumaA_B(a + 1, b);

		return dato;
	}

	public void amosa(int n) {// 231

		if (n > 1)
			amosa(n - 1);
		System.out.print(" " + vector[n - 1]);
	}

	public void amosaReves(int n) {// 232

		System.out.print(" " + vector[n - 1]);
		if (n > 1)
			amosa(n - 1);

	}

	public void amosaRevesCadena(int n) {// prepara03

		if (cadena[n] != '\0') {

			amosaRevesCadena(n + 1);
			System.out.print(cadena[n]);
		}

	}

	public void recolleCadena() throws IOException {// prepara03

		char letra;
		int i;

		letra = (char) System.in.read();

		i = 0;

		while (letra != '\r') {

			cadena[i] = letra;
			letra = (char) System.in.read();
			i++;
		}
	}

	public void amosaSenDixitos(int n) {// prepara05

		if (cadena[n] != '\0') {
			if (cadena[n] < '0' || cadena[n] > '9') {
				
				System.out.print(cadena[n]);
			}
			amosaSenDixitos(n + 1);
		}
	}

	public int total() {// prepara09

		int total = 0;
		while (cadena[total] != '\0')
			total++;
			//total--;

		return total;
	}

	public void amosaDixitosDuplicados(int total) {// prepara09


		if (total > 0) {

			amosaDixitosDuplicados(total - 1);
			
			if (cadena[total-1] >= '0' && cadena[total-1] <= '9') {

				System.out.print(cadena[total-1]);

			}
			System.out.print(cadena[total-1]);

		}
	}
	
	public void amosaRevesAaEeDuplicados(int n) {//pregunta3
		
		
		if (cadena[n]!='\0') {

			amosaRevesAaEeDuplicados(n + 1);
			
			if (cadena[n] == 'A' || cadena[n] == 'a' || cadena[n] == 'E' || cadena[n] == 'e') {

				System.out.print(cadena[n]);

			}
			System.out.print(cadena[n]);

		}
		
	}

	public void amosaAaEeDuplicados(int n) {//pregunta3_a
		
		
		if (cadena[n]!='\0') {

			System.out.print(cadena[n]);
			
			if (cadena[n] == 'A' || cadena[n] == 'a' || cadena[n] == 'E' || cadena[n] == 'e') 

				System.out.print(cadena[n]);
			
			amosaAaEeDuplicados(n + 1);		
				
		}		
	}

}
