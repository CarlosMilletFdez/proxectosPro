package preparatorios08_16;

import java.io.IOException;
import java.util.Scanner;

public class prepara11 {

	public static void main(String[] args) throws IOException {
		
		char tecla;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame DIXITO ou VOCAL minuscula: ");
		tecla = (char)System.in.read();
		teclado.nextLine();
		
		while (tecla >= '0' && tecla <= '9' || tecla == 'a' || tecla == 'e'|| tecla == 'i' || tecla == 'o' || tecla == 'u') {
			
			if (tecla >= '0' && tecla <= '9')
				System.out.println("-> CORRECTO, pulsaches este DIXITO: " + tecla);
				
			else 
				System.out.println("-> CORRECTO, pulsaches esta VOCAL: " + tecla);
			
		
		System.out.print("Dame DIXITO ou VOCAL minuscula: ");
			tecla = (char)System.in.read();
			teclado.nextLine();
		}
		
		System.out.println("+++++> INCORRECTO, pulsaches esta tecla: " + tecla);
			teclado.close();	
	}
	
	

}
