package teoria.capitulo5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class LeerUnaCadena {

	public static void main(String[] args) {

		//Definir un flujo de caracteres de entrada: flujoE
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader flujoE = new BufferedReader(isr);
		//Definir una referencia al lfujo estándar de salida: flujoS
		PrintStream flujoS = System.out;
		String sdato; //variable para almacenar una linea de texto
		
		try {
			flujoS.print("Introduzca un texto: ");
			sdato = flujoE.readLine(); //leer una linea de texto
			flujoS.println(sdato);     //escribir la linea de texto
		}
		
		catch (IOException ignorada) {
			
		}

	}

}
