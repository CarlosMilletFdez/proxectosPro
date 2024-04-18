package compilador35_40;

import java.util.Scanner;

import misClases.avaliacion1.CSerie;

public class compi38 {

	public static void main(String[] args) {
	
		CSerie serie = new CSerie();
		int i;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame un número entre 1 e 20: ");
		i = teclado.nextInt();
		
		serie.amosaDende20(i);

		teclado.close();
	}

}
