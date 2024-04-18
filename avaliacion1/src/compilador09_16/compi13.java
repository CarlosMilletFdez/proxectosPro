package compilador09_16;

import java.util.Scanner;

public class compi13 {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese primera nota: ");
		float primeranota = teclado.nextFloat();
		
		System.out.print("Ingrese segunda nota: ");
		float segundanota = teclado.nextFloat();
		
		System.out.print("Ingrese tercera nota: ");
		float terceranota = teclado.nextFloat();
		
		float sumedia = ((primeranota + segundanota + terceranota)/3f);
		System.out.println("Su media ---> " + sumedia);
		
		if (sumedia >= 7) {
			System.out.println("PROMOCIONADO");
			
		}
		else {
			
		}
		teclado.close();
	}
	
}
