package misClases.avaliacion3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import misClases.utilidades.Leer;

public class Fichero {
	
	File archivo;
	String nombre;
	String mensaje;
	
	public Fichero() {
		archivo= null;
		nombre= null;
		mensaje= "Nombre del fichero: ";
	}
	
	public void asignaFichero() {
	
		String nombreFichero;
		
		do {
			System.out.print("Nombre del fichero: ");
			nombreFichero = Leer.datoString();
			archivo = new File(nombreFichero);
		}
		while (!archivo.exists());
	}
	
	public void amosa() {
		
		FileReader fe = null;
		int caracter;
		
		try {
			fe= new FileReader(archivo);
			while((caracter = fe.read())!= -1)
				System.out.print((char)caracter);
		}
		catch (IOException e) {
			System.out.println("Error: " + e.toString());
		}
		finally {
			try {
				if(fe != null)
					fe.close();
				
			}
			catch (IOException e) {
				System.out.println("Error: " + e.toString());
			}
		}
	}
	
	public void asignaFicheroLectura() {

		String nombreFichero = null;

		do {
			System.out.print("Nombre del fichero origen: ");
			nombreFichero = Leer.datoString();
			archivo = new File(nombreFichero);
		} while (!archivo.exists());
	}
	
	public void asignaFicheroEscritura() {
		String nombreFichero = null;
		
		System.out.print("Nombre del fichero destino: ");
		nombreFichero = Leer.datoString();
		archivo = new File(nombreFichero);
		
	}
	
	public void copia(Fichero fDestino) {
		
		FileReader fe = null;
		FileWriter fs = null;
		int caracter;
		
		try {
			fe = new FileReader(archivo);
			fs = new FileWriter(fDestino.archivo);
			while((caracter = fe.read())!=-1)
				fs.write(caracter);
		}
		catch (IOException e) {
			System.out.println("Error: " + e.toString());
		}
		finally {
			try {
				if (fe != null)
					fe.close();
				if (fs != null)
					fs.close();
			}
			catch (IOException e) {
				System.out.println("Error: " + e.toString());
			}
		}
	}
	
//	public void amosaFinal()  {//311
//		FileReader fe = null;
//		int caracter, i;
//		
//		try {
//			fe= new FileReader(archivo);
//			i=0;
//			while((caracter=fe.read())!=-1) {
//				if ((char)caracter !='\r'&&(char)caracter!='\n')
//					i++;
//				else if ((char)caracter =='\r') {
//					System.out.println(" --->"+ i );
//					i=0;
//				}
//			}
//		System.out.print((char)caracter);
//			
//		}//		 catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Error: "+ e.toString());
//		}finally{
//		
//			try{}
//				
//			}
//	}
//}
}