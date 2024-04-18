package pizarra15_22;

import java.io.IOException;

public class piza21 {

	public static void main(String[] args) throws IOException {
		char tecla;
		System.out.println("Presione unha tecla: ");
		tecla = (char)System.in.read();
		if (tecla >= 'A' && tecla <='Z' || tecla == 'Ñ') {
			System.out.println("MAIUSCULA");
		}else if (tecla >='a' && tecla <='z' || tecla == 'ñ') {
			System.out.println("MINUSCULA");
		}else if (tecla >= '0' && tecla <= '9') {
			System.out.println("DIGITO");
		}else 
			System.out.println("Tecla NON PERMITIDA");
			

	}

}
