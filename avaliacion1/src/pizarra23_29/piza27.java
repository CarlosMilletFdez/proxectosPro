
package pizarra23_29;

import java.util.Scanner;

public class piza27 {

	public static void main(String[] args) {
		
		int f1, f2;
		Scanner teclado = new Scanner(System.in);
		
		for (f1 = 1; f1 <= 10; f1 = f1 + 1) {
			System.out.println("Taboa do " + f1 + ": ");
			
			for (f2 = 1; f2 <= 10; f2 = f2 + 1) 
				System.out.println(f1 + " x" + " " + f2 + " = " + f1 * f2);
			
			teclado.nextLine();
		}
		teclado.close();
	}
	
	

}
