package compilador01_08;

import java.util.Scanner;

public class compi08 {
	
	public static void main (String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Idade de Uxia(EN MESES): ");
		int mesesuxia = teclado.nextInt();
		
		System.out.print("Idade de Maruxa(EN MESES): ");
		int mesesmaruxa = teclado.nextInt();
		
		System.out.print("Idade de Anxo(EN MESES): ");
		int mesesanxo = teclado.nextInt();
		
		int anosuxia = mesesuxia / 12;
		int rmesesuxia = mesesuxia % 12;  // - anosuxia * 12;
		System.out.println("Uxia ten " + anosuxia + " anos e " + rmesesuxia + " meses");
		
		int anosmaruxa = mesesmaruxa / 12;
		int rmesesmaruxa = mesesmaruxa - anosmaruxa * 12;
		System.out.println("Maruxa ten " + anosmaruxa + " anos e " + rmesesmaruxa + " meses");
		
		int anosanxo = mesesanxo / 12; 
		int rmesesanxo = mesesanxo - anosanxo * 12;
		System.out.println("Anxo ten " + anosanxo + " anos e " + rmesesanxo + " meses");	
		
		teclado.close();
		
	}
}
	
