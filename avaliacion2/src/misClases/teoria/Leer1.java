package misClases.teoria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer1 {
	
	public Leer1(){
		
		System.out.println("Se carga la instancia");
	}
	
	static {
		
		System.out.println("Se carga la clase");
		
	}
	
	public static String dato() {
		
		String sdato = "";
		
		try {
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader flujoE = new BufferedReader(isr);
			sdato = flujoE.readLine();
		}
		
		catch (IOException e) {
			
			System.out.println("Error: " + e.getMessage());
		}
		
		return sdato;
	}
	
	public static short datoShort() {
		
		try {
			
			Short s = new Short(dato());
			return s.shortValue();
		}
		
		catch (NumberFormatException e) {
			
			return Short.MIN_VALUE;
		}
	}

	public static int datoInt() {
		
		try {
			
			Integer i = new Integer(dato());
			return i.intValue();
		}
		
		catch (NumberFormatException e) {
			
			return Integer.MIN_VALUE;
		}
	}
	
	public static long datoLong() {
		
		try {
			Long l = new Long(dato());
			return l.longValue();
		}
		
		catch (NumberFormatException e) {
			
			return Long.MIN_VALUE;
		}
	}
	
	public static float datoFloat() {
		
		try {
			
			Float f = new Float(dato());
			return f.floatValue();
		}
		
		catch (NumberFormatException e) {
			
			return Float.MIN_VALUE;
		}
	}
	
	public static double datoDouble() {
		
		try {
			Double d = new Double(dato());
			return d.doubleValue();
		}
		
		catch (NumberFormatException e) {
			return Double.NaN;
		}
	}
	
}
