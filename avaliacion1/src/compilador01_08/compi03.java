package compilador01_08;

import java.util.Scanner; 

public class compi03 {
	
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame a base: ");
		int base = teclado.nextInt();
		
		System.out.print("Dame a altura:");
		int altura = teclado.nextInt();
		
		float area = (base*altura)/2f;
		System.out.print("Area do triangulo: " + area);
		
		teclado.close();
		
	}
}