package compilador26_34;

import java.util.Scanner;

public class compi32 {

	public static void main(String[] args) {
		int totaltriangulos, triangulosgrandes = 0;
		float altura, base, superficie = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("TOTAL triangulos: ");
		totaltriangulos = teclado.nextInt();
		for (int triangulos = 1; triangulos <= totaltriangulos; triangulos++) {
			System.out.print("**Dame base " + triangulos + ": ");
			base = teclado.nextInt();
			System.out.print("Dame altura " + triangulos + ": ");
			altura = teclado.nextInt();
			superficie = (base * altura) / 2;
			System.out.println("*Superficie " + triangulos + ":" + superficie);

			if (superficie > 12) {
				triangulosgrandes = triangulosgrandes + 1;	
			}
			
		}
		System.out.println("Triangulos superficie superior a 12 son: " + triangulosgrandes);
		teclado.close();
	}

}
