package compilador17_25;

import java.util.Scanner;

public class compi23 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int plantel, numerodesoldos = 0, mellorpagados = 0, peorpagados = 0;
		float soldo, totalsoldos = 0;
		System.out.print("Cantos empleados hai: ");
		plantel = teclado.nextInt();

		while (plantel > numerodesoldos) {
			numerodesoldos = numerodesoldos + 1;
			System.out.print("Dame soldo " + numerodesoldos + ":");
			soldo = teclado.nextFloat();
			totalsoldos = soldo + totalsoldos;

			if (soldo >= 100 && soldo <= 300) {
				peorpagados = peorpagados + 1;

			} else if (soldo > 300) {
				mellorpagados = mellorpagados + 1;

			}
		}
		System.out.println("Empleados con soldos entre 100 e 300: " + peorpagados);
		System.out.println("Empleados con soldos superiores a 300: " + mellorpagados);
		System.out.println("Gastos totais da empresa en soldos: " + totalsoldos);

		teclado.close();
	}

}
