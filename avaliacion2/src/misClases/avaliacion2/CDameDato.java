package misClases.avaliacion2;

import java.util.Scanner;

public class CDameDato {

	private int opcion, datoInt;
	private float datoFloat;
	private String datoString = new String();
	private Scanner teclado = new Scanner(System.in);

	private void amosarMenu() {
	
	System.out.println("\nMENU");
	System.out.println("=======");
	System.out.println("1.-Dame un ENTEIRO");
	System.out.println("2.-Dame un REAL");
	System.out.println("3.-Dame unha CADEA");
	System.out.println("4.-FINAL");
	
	}
	
	public int seleccionaOpcion(){
	
		amosarMenu();
		opcion = teclado.nextInt();
	
		return opcion;
	
	}
	
	public void recollerDatoInt() {
		
		System.out.println("Introduza un número enteiro: ");
		datoInt = teclado.nextInt();
		
	}
	
	public void amosarDatoInt() {
	
		System.out.print("\nNúmero enteiro pulsado: " + datoInt);
	}
	
	public void recollerDatoFloat() {
		
		System.out.println("Introduza un número real: ");
		datoFloat = teclado.nextFloat();
		
	}
	
	public void amosarDatoFloat() {
		
		System.out.print("\nNúmero real pulsado: " + datoFloat);
	}
	
	public void recollerCadea() {
		
		teclado.nextLine();
		System.out.println("Dame unha cadea:");
		datoString = teclado.nextLine();
		
		}
	
	public void amosarCadea(){
		
		System.out.print("\nCadea pulsada: " + datoString);
	}
	
}

