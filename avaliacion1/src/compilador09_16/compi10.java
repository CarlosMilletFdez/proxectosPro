package compilador09_16;

import java.util.Scanner;

public class compi10 {

	public static void main (String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame precio de compra: ");
		float pcompra = teclado.nextFloat();
		
		float pventa = pcompra + (pcompra * 35)/100; 
		System.out.println("Precio de venta------> " + pventa);
		
		float pvp = pventa + (pventa*18)/100;
		System.out.println("PVP -----------------> " + pvp);
		
		teclado.close();
	}
}
