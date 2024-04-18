package pizarra37_42;

import misClases.avaliacion1.CNotas;

public class piza42 {

	public static void main(String[] args) {
		
		float medianotas;
		
		CNotas Notas=new CNotas();
		
		Notas.mostraNotas();
		
		medianotas = Notas.dameNotaMedia();
		System.out.println("\n===================");
		System.out.println("Nota Media: " + medianotas);
	}

}
