package compilador01_08;

import java.util.Scanner;

public class compi07 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("A idade de Uxia(EN MESES): ");
		int mesesuxia = teclado.nextInt(); 
		
		System.out.print("A idade de Maruxa(EN MESES): ");
		int mesesmaruxa = teclado.nextInt();
		
		System.out.print("A idade de Anxo(EN MESES): ");
		int mesesanxo = teclado.nextInt();
		
		int anosuxia = mesesuxia / 12;
		System.out.println("Os anos de Uxia son " + anosuxia);
		
		int anosmaruxa = mesesmaruxa / 12;
		System.out.println("Os anos de Maruxa son " + anosmaruxa);
		
		int anosanxo = mesesanxo / 12;
		System.out.println("Os anos de Anxo son " + anosanxo);
		
		teclado.close();
	}

}
