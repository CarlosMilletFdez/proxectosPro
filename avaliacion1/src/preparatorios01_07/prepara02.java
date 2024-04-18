package preparatorios01_07;

import java.util.Scanner;

public class prepara02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int idade;
		
		System.out.print("Dame idade: ");
		idade = teclado.nextInt();
		
		while (idade >=1 && idade<=9 || idade >= 65 && idade <=110) {
			
			
			if (idade<=9)
				System.out.print("-> ESTE CATIVO TEN " + idade + " ANOS");
			
			else 
				System.out.print("-> ESTE ANCIAN TEN " + idade + " ANOS");
			
			System.out.print("\nDame idade: ");
			idade = teclado.nextInt();
		}
		
		System.out.println("+++++> Idade NON permitida");
		
		
		teclado.close();
	}
	
}
