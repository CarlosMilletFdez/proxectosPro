package misClases.avaliacion2;

import java.util.Scanner;

public class CVector {

	int total, opcion;
	int[] vector = new int[20];

	Scanner teclado = new Scanner(System.in);

	public void iniciarVector() {

		vector[0] = 3;
		vector[1] = 12;
		vector[2] = 15;
		vector[3] = 22;
		vector[4] = 30;
		vector[5] = 43;

		total = 6;

	}

	public void amosarVector() {

		for (int i = 0; i < total; i++) {

			System.out.print(vector[i] + " ");
		}

		System.out.println("\nO total de enteiros que ten o vector é " + total);

	}

	public void insertarEnteiro(int enteiro) {

		int aux;

		vector[total] = enteiro;

		total = total + 1;

		for (int i=0 ; i < total; i++) {
			
			for (int j=1; j < (total-i); j++) {
				
				if (vector[j-1]>vector[j]) {
					
					aux=vector[j-1];
					vector[j-1]=vector[j];
					vector[j]=aux;
				
				}
			}
			
		}

	}
	
//	public void insertarEnteiro2(int enteiro) {
//		
//		for (int i=0; i < total; i++) {
//			
//			if (enteiro < vector[i]) {
//				
//				for(int j = total -1; j >= i; j--) {
//					
//					vector[j + 1] = vector[j];
//					System.out.println(i+" "+j);
//				}
//				vector[i]= enteiro;
//				total = total + 1;
//				break;
//			}
//		}
//	}
	
	public void eliminarEnteiro(int enteiro) {
		
		for (int i = 0; i<total; i++) {
			
			while (vector[i]==enteiro) {
				
				for (int j=i+1; j<total; j++) {
					
					vector[j-1]= vector[j];
					
				}
				total = total - 1;
				vector[total] = 0;
			}
		}
	}

	private void amosarMenu() {

		System.out.println("\nMENU");
		System.out.println("======");
		System.out.println("1.- INICIALIZA Vector de enteiros");
		System.out.println("2.- AMOSA Vector");
		System.out.println("3.- INSERTA enteiro en Vector");
		System.out.println("4.- ELIMINA enteiro en Vector");
		System.out.println("5.- FINAL");
	}

	public int seleccionaOpcion() {

		amosarMenu();
		opcion = teclado.nextInt();

		return opcion;

	}

}
