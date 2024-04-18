package pizarra15_22;

import java.io.IOException;

public class piza19 {

	public static void main(String[] args) throws IOException {
		char tecla;
		System.out.println("Presione unha tecla: ");
		tecla = (char) System.in.read();
		if (tecla >= 'A' && tecla <= 'Z') {
			System.out.println("MAIUSCULA: " + tecla);
		} else if (tecla >= 'a' && tecla <= 'z') {
			System.out.println("MINUSCULA: " + tecla);
		} else if (tecla >= '0' && tecla <= '9') {
			System.out.println("DIGITO: " + tecla);
		} else
			System.out.println("Tecla NON PERMITIDA");
	}

}
