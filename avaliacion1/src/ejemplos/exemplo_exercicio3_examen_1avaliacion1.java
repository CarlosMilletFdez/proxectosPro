package ejemplos;

import java.util.Scanner;
import java.io.IOException;

public class exemplo_exercicio3_examen_1avaliacion1 {

	public static void main(String[] args) throws IOException {
		
		Scanner teclado = new Scanner(System.in);
		char tecla;
		
		System.out.print("Introduza un DÍXITO ou CONSONANTE maiúscula: ");
		tecla = (char)System.in.read();
	
		
		while ((tecla <='B' || tecla>='Z') && (tecla <='0'||tecla>='9') || tecla=='E'||tecla =='I'||tecla=='O'||tecla=='U'){
				System.out.println("INCORRECTO, pulsaches esta tecla: " + tecla);
				teclado.nextLine();
				
				System.out.print("Introduza un DÍXITO ou CONSONANTE maiúscula: ");
				tecla = (char)System.in.read();
		}
		teclado.close();
		
		if (tecla>='0'&& tecla <='9') {
			System.out.println("CORRECTO, pulsaches este DÍXITO: " + tecla);
		}
		else 
			System.out.println("CORRECTO, pulsaches esta CONSONANTE maiúscula: "+ tecla);
	}
	
}
