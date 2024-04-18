package compilador09_16;

import java.util.Scanner;

public class compi09 {
	
	public static void main (String [] args){
		
		Scanner teclado = new Scanner(System.in);
	
		System.out.print("Dame numero 1: ");
		int num1 = teclado.nextInt();
	
		System.out.print("Dame numero 2: ");
		int num2 = teclado.nextInt();
		
		int suma = num1 + num2;
		System.out.println("A suma e ------------>" + suma);
	
		int resta = num1 - num2;
		System.out.println("A resta e ----------->" + resta);
		
		int multi = num1 * num2;
		System.out.println("A multiplicacion e -->" + multi + "  (numero1-numero2)");
		
		int divi = num1 / num2;
		System.out.println("A division e -------->" + divi + "  (numero1/numero2)");
		
		int mod = num1 % num2; 
		System.out.println("O modulo e ---------->" + mod + "  (numero1%numero2)");
		
		float divid = (num1*1f / num2*1f);
		System.out.println("A division real e --->" + divid + "  (numero1/numero2)");
		
		float media = (num1 + num2)/2f;
		System.out.println("A media real e------->" + media);
		
		teclado.close();
	}	
	
}
