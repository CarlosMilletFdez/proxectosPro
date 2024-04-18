package pizarra30_36;

import java.util.Scanner;

public class piza30 {

	public static void main(String[] args) {
		
		int num;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduza un número: ");
		num= teclado.nextInt();
		
		while (num <1 || num >20) {
			
			System.out.print("Introduza outro número: ");
			num=teclado.nextInt();
		
		}
		//if (num>=1 && num<=20)
			
			System.out.println("FINAL");
			
			
	teclado.close();
	}
		
}
