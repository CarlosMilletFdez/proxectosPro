package examen2023;

import java.util.Scanner;

public class pregunta1 {

		
	public static void main(String[] ar) {
		
	
			int edad, conta40_60, conta55_65, conta60_80, conta65_90;
			Scanner teclado = new Scanner(System.in);

			System.out.print("  Dame edad: ");
			edad = teclado.nextInt();
			
			conta40_60 = conta55_65 = conta60_80 = conta65_90 = 0;
			while (edad >= 40 && edad <= 90) {
				
				System.out.print("CORRECTO, edad pulsada: " + edad);
				if (edad >= 40 && edad <= 55) {
					conta40_60++;
					conta55_65++;
					System.out.println("  -> modificado este intervalo: (40,60)(55,65)");
				} 
				else if (edad > 55 && edad <= 60) {
					conta40_60++;
					conta60_80++;
					conta55_65++;
					System.out.println("  -> modificados estos intervalos: (40,60)(55,65)(60,80)");
				} 
				else if (edad > 60 && edad < 65) {
					conta55_65++;
					conta60_80++;
					System.out.println("  -> modificado estos intervalos: (55,65)(60,80)");
				} 
				else if (edad > 65 && edad <= 80) {
					conta65_90++;
					conta60_80++;
					System.out.println("  -> modificados estos intervalos: (60,80)(65,90)");
				}
				else if (edad > 80 && edad <= 90) {
					conta65_90++;
					System.out.println("  -> modificado este intervalo:(65,90)");

				}
				else if (edad == 65) {
					conta55_65++;
					conta60_80++;
					conta65_90++;
					System.out.println("  -> modificados estos intervalos: (55,65)(60,80)(65,90)");
					
					
				}
				System.out.print("  Dame edad: ");
				edad = teclado.nextInt();

			}
			System.out.println("  +++++> Entre 40 e 60 pulsaronse " + conta40_60 + " edades");
			System.out.println("  +++++> Entre 55 e 65 pulsaronse " + conta60_80 + " edades");
			System.out.println("  +++++> Entre 60 e 80 pulsaronse " + conta55_65 + " edades");
			System.out.println("  +++++> Entre 65 e 90 pulsaronse " + conta65_90 + " edades");
			teclado.close();
	}

}