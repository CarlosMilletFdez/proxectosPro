package compilador35_40;

import java.util.Scanner;

import misClases.avaliacion1.CSerie;

public class compi40 {

	public static void main(String[] args) {
		int a,b;
		CSerie Serie = new CSerie();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("O numero A sera menor que o numero B");
		System.out.print("Dame o numero A: ");
		a = teclado.nextInt();
		System.out.print("Dame o numero B: ");
		b = teclado.nextInt();
		//a=5;
		//b=10;
		Serie.amosaB_A(a, b);
		teclado.close();
	}

}
