package misClases.teoria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer {

	public static String dato() {
		
		String sdato = "";
		try {
			//Definir un flujo de caracteres de entrada: flujoE
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader flujoE = new BufferedReader(isr);
			//Leer. La entrada finaliza al pulsar la tecla Entrar
			sdato= flujoE.readLine();
		}
		
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			
		}
		return sdato; //devolver el dato tecleado
	}
	
	public static short datoShort() {
		
		try {
			
			return Short.parseShort(dato());	
		}
		catch (NumberFormatException e) {
			
			return Short.MIN_VALUE; //valor mas peque�o
		}
	}
	
	public static int datoInt() {
		
		try {
			
			return Integer.parseInt(dato());
		}
		
		catch (NumberFormatException e) {
			
			return Integer.MIN_VALUE; 
		}
	}
	
	public static long datoLong() {
		
		try {
			
			return Long.parseLong(dato());
		}
		
		catch (NumberFormatException e) {
			
			return Long.MIN_VALUE;
		}
	}
	
	public static double datoDouble() {
		
	
		try {
			
			return Double.parseDouble(dato());
		}
		
		catch (NumberFormatException e) {
			
			return Double.NaN;//no es un n�mero; valor double.
		}
	}
	
	public static float datoFloat () {
		
		try {
			
			return Float.parseFloat(dato());
		}
		
		catch (NumberFormatException e) {
			
			return Float.NaN;// no es un n�mero; valor float
		}
	}
	
}
