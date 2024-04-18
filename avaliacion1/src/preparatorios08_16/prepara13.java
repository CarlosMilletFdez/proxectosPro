package preparatorios08_16;

import java.util.Scanner;

public class prepara13 {

	public static void main(String[] args) {

		int idade = 0, cont10_30 = 0, cont15_21 = 0, cont25_45 = 0, cont30_50 = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame IDADE: ");
		idade = teclado.nextInt();

		while (idade >= 10 && idade <= 50) {

			System.out.print("CORRECTO, idade pulsada: " + idade);
			
			if (idade >=10 && idade<15) {
				cont10_30=cont10_30 +1;
				System.out.print("-> modificado este intervalo: (10,30)");
			}
			else if (idade >=15 && idade<=21) {
				cont10_30 = cont10_30 + 1;
				cont15_21 = cont15_21 + 1;
				System.out.print("-> modificado estos intervalos: (10,30)(15,21)");

			}
			else if (idade >21 && idade<25) {
				cont10_30 = cont10_30 + 1;
				System.out.print("-> modificado este intervalo: (10,30)");
				
			}
			else if (idade >=25 && idade<30) {
				cont10_30 = cont10_30 + 1;
				cont25_45= cont25_45 + 1;
				System.out.print("-> modificado estos intervalos: (10,30)(25,45)");
			}
			else if (idade == 30) {
				cont10_30 = cont10_30 + 1;
				cont25_45= cont25_45 + 1;
				cont30_50 = cont30_50 + 1;	
				System.out.print("-> modificado estos intervalos: (10,30)(25,45)(30,50)");
			}
			else if (idade >30 && idade<=45) {
				cont25_45= cont25_45 + 1;
				cont30_50 = cont30_50 + 1;
				System.out.print("-> modificado estos intervalos: (25,45)(30,50)");
			}
			else {
				cont30_50 = cont30_50 + 1;
				System.out.print("-> modificado este intervalo: (30,50)");
			}
			
			System.out.print("\nDame IDADE: ");
			idade = teclado.nextInt();
		}

		System.out.println("+++++> Entre 10 e 30 pulsaronse " + cont10_30 + " idades");
		System.out.println("+++++> Entre 30 e 50 pulsaronse " + cont30_50 + " idades");
		System.out.println("+++++> Entre 15 e 21 pulsaronse " + cont15_21 + " idades");
		System.out.println("+++++> Entre 25 e 45 pulsaronse " + cont25_45 + " idades");

		teclado.close();
	}

}
