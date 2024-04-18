package compilador01_08;

import java.util.Scanner;

public class compi06 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Idade do alumno 1: ");
		int idade1 = teclado.nextInt();
		
		System.out.print("Idade do alumno 2: ");
		int idade2 = teclado.nextInt();
		
		System.out.print("Idade do alumno 3: ");
		int idade3 = teclado.nextInt();
		
		float media = (idade1 + idade2 + idade3)/3f;
		System.out.println("A idade media e " + media);
		
		teclado.close();
		}

}
