package compilador17_25;

import java.util.Scanner;

public class compi23b {

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
			
			
			while (soldo < 100 || soldo > 600) { //comprobamos que o soldo esta entre 100 e 600 para que sexa valido
					System.out.print("O soldo non é válido dame outro soldo " + numerodesoldos + ":");//repite ata meter un soldo valido
					soldo = teclado.nextInt();
			}
			totalsoldos = soldo + totalsoldos; //fai a suma só cos soldos entre 100 e 600
				
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
