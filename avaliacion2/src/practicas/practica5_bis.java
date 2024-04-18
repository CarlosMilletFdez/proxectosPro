package practicas;
import misClases.avaliacion2.CArrayCaracteres_bis;
import misClases.avaliacion2.CMatrices_bis;
import misClases.avaliacion2.CString_bis;
import misClases.teoria.Leer;
import java.util.Scanner;

public class practica5_bis {
	
	private static void menu() {
		System.out.println("\n");
		System.out.println("1.- Matrices");
		System.out.println("2.- Array de caracteres");
		System.out.println("3.- String");
		System.out.println("4.- Sair");
		System.out.println("\n");
	}
	   private static int dameOpcion() {
		      menu();
		      int numero = Leer.datoInt();
		      
		      return numero;
		   }
	
	public static void main(String[] args) {
	
		CMatrices_bis matriz = new CMatrices_bis();
		CArrayCaracteres_bis array = new CArrayCaracteres_bis();
		CString_bis string = new CString_bis();
		int op;
		
		do {
			
			op= dameOpcion();
			
			switch(op) {
			
			case 1:
//				matriz.recoge();
				matriz.amosa('A', 'B');
				System.out.println("\n");
				matriz.trasposta('A', 'C');
				matriz.trasposta('B', 'D');
				matriz.amosa('C','D');
				System.out.println("\n");
				matriz.suma('A', 'B','C');
				matriz.resta('A','B','D');
				matriz.amosa('C','D');
				System.out.println("\n");
				matriz.resta('B','A','C');
				matriz.multiplica('A','B','D');
				matriz.amosa('C','D');
				System.out.println("\n");
				break;
				
			case 2:
				array.recoge();
				array.amosa();
				array.maiusculas();
//				array.minusculas();
//				array.arroba();
//				array.espacioBlanco();
//				array.sinNumeros();
//				array.amosa();
				break;
				
			case 3:
//				string.recoge();
//				string.amosa();
//				string.maiusculas();
//				string.minusculas();
//				string.arroba();
//				string.espacioBlanco();
//				string.sinNumeros();
//				string.amosa();
				break;
				
			case 4:
				System.out.println("FINAL");
				break;
				
			default:
				System.out.println("OPCION ERRONEA");
						
				
			
			}
			
			
			
		}while(op!=4);
		
		
		
		
	}

}