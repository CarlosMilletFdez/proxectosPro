package pizarra30_36;

import java.util.Scanner;

public class piza31 {

	public static void main(String[] args) {
	
		int idade;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduza unha idade en anos: ");
		idade=teclado.nextInt();
		
		while ((idade < 1 || idade > 7)&& (idade<65||idade>110)) {
			
			System.out.print("Introduza unha idade en anos: ");
			idade=teclado.nextInt();
		}	
		System.out.println("FINAL");
		teclado.close();
	}

}
