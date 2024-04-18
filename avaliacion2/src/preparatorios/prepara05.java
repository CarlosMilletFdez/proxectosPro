package preparatorios;

import java.io.IOException;

import misClases.avaliacion2.CRecursivo;

public class prepara05 {

	public static void main(String[] args) throws IOException {
		
		int n=0;
		CRecursivo recursivo= new CRecursivo();
		System.out.println("Dame cadena: ");
		recursivo.recolleCadena();
		recursivo.amosaSenDixitos(n);

	}

}
