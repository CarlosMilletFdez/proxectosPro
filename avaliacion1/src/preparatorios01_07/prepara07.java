package preparatorios01_07;

import java.util.Scanner;

import misClases.avaliacion1.CSerie;

public class prepara07 {

	public static void main(String[] args) {
		
		CSerie serie= new CSerie();
		int a, b;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("O numero A sera menor que o numero B");
		
		System.out.print("Dame o numero A: ");
		a = teclado.nextInt();
		
		System.out.print("Dame o numero B: ");
		b = teclado.nextInt();
		
		serie.amosaA_BrestaBtres(a, b);

		teclado.close();
	}

}
