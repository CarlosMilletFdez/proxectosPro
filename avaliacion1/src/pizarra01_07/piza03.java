package pizarra01_07;

import java.util.Scanner;

public class piza03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.println("Dame un numero menor que 20: ");
		num = teclado.nextInt();
		
		while (num < 20) {
			System.out.println(num + 1);
			num ++;
		}
		
		teclado.close();
	}

}
