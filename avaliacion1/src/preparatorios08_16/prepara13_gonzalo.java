package preparatorios08_16;

import java.util.Scanner;

class prepara13_gonzalo {

	public static void main(String[] ar) {
		int edad, conta10_30, conta30_50, conta15_21, conta25_45;
		Scanner teclado = new Scanner(System.in);

		System.out.print("  Dame edad: ");
		edad = teclado.nextInt();
		conta10_30 = conta30_50 = conta15_21 = conta25_45 = 0;
		while (edad >= 10 && edad <= 50) {
			System.out.print("CORRECTO, edad pulsada: " + edad);
			if (edad >= 10 && edad < 15) {
				conta10_30++;
				System.out.println("  -> modificado este intervalo: (10,30)");
			} else if (edad >= 15 && edad <= 21) {
				conta10_30++;
				conta15_21++;
				System.out.println("  -> modificados estos intervalos: (10,30) (15,21)");
			} else if (edad > 21 && edad < 25) {
				conta10_30++;
				System.out.println("  -> modificado este intervalo: (10,30)");
			} else if (edad >= 25 && edad < 30) {
				conta10_30++;
				conta25_45++;
				System.out.println("  -> modificados estos intervalos: (10,30) (25,45)");
			} else if (edad == 30) {
				conta10_30++;
				conta25_45++;
				conta30_50++;
				System.out.println("  -> modificados estos intervalos: (10,30) (25,45) (30,50)");
			} else if (edad > 30 && edad <= 45) {
				conta25_45++;
				conta30_50++;
				System.out.println("  -> modificados estos intervalos: (25,45) (30,50)");
			} else { // edad>45 e edad<=50
				conta30_50++;
				System.out.println("  -> modificado este intervalo: (30,50)");
			}
			System.out.print("  Dame edad: ");
			edad = teclado.nextInt();
		}
		System.out.println("  +++++> Entre 10 e 30 pulsaronse " + conta10_30 + " edades");
		System.out.println("  +++++> Entre 30 e 50 pulsaronse " + conta30_50 + " edades");
		System.out.println("  +++++> Entre 15 e 21 pulsaronse " + conta15_21 + " edades");
		System.out.println("  +++++> Entre 25 e 45 pulsaronse " + conta25_45 + " edades");
		teclado.close();
	}
}
