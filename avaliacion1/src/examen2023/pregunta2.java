package examen2023;

import java.util.Scanner;
import java.io.IOException;

public class pregunta2 {

	public static void main(String[] args) throws IOException {
		
		char tecla;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame CONSONANTE MAIÚSCULA ou SÍMBOLO: ");
		tecla = (char)System.in.read();
		teclado.nextLine();
		
		
		while ( (tecla < 'B' || tecla > 'Z') && tecla!='%' && tecla!='[' && tecla!='{'||tecla=='E'||tecla=='I'||tecla=='O'||tecla=='U') {
			
			System.out.println("-> INCORRECTO, pulsaches esta tecla: " + tecla);
				
			System.out.print("Dame CONSONANTE MAIÚSCULA ou SÍMBOLO: ");
				tecla = (char)System.in.read();
				teclado.nextLine();
			
		}
		
		if ((tecla>='B' && tecla<='Z') ) {
			
			System.out.println("+++++> CORRECTO, pulsaches esta CONSONANTE MAIUSCULA: " + tecla);
		}
		
		else if (tecla=='%' || tecla=='[' || tecla=='{'){
			System.out.println("+++++> CORRECTO, pulsaches este SIMBOLO: " + tecla);
		}	
		
		
		teclado.close();		
	}
	
}

