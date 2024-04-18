package compilador35_40;

import java.util.Scanner;

import misClases.avaliacion1.CSerie;

public class compi39 {

	public static void main(String[] args) {
		
		int a,b;
		Scanner teclado = new Scanner(System.in);
		System.out.println("O numero A sera menor que o numero B");
		System.out.print("Dame o numero A: ");
		a = teclado.nextInt();
		System.out.print("Dame o numero B: ");
		b = teclado.nextInt();
		CSerie Serie = new CSerie();
		Serie.amosaA_B(a, b);
		
		teclado.close();
	}
}
