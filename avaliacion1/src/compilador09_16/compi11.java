package compilador09_16;

import java.util.Scanner;

public class compi11 {
		
	public static void main (String []args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame PVP: ");
		float PVP = teclado.nextFloat();
		
		float preciosiniva = PVP/1.18f;

		System.out.println("Precio ----------> " + preciosiniva);
		
		float preciorebajado = preciosiniva - (preciosiniva*25)/100f; 
		System.out.println("Precio rebajado--> " + preciorebajado);
		
		float nuevoPVP = preciorebajado + (preciorebajado*18)/100f;
		System.out.println("Nuevo PVP -------> " + nuevoPVP);

		
	teclado.close();
	
	}

}
