package compilador35_40;

import java.util.Scanner;

import misClases.avaliacion1.CSerie;

public class compi37 {

	public static void main(String[] args) {
	
		int num;
		CSerie Serie = new CSerie();
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame un numero entre 1 e 20: ");
		num = teclado.nextInt();
		
		Serie.amosaAta20(num);
		teclado.close();
	}

}
