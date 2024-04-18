package pizarra37_42;

import misClases.avaliacion1.CNotas;

public class piza41 {

	public static void main(String[] args) {
	
		int menor=0;
		float notamenor;
		CNotas Notas= new CNotas();
		Notas.mostraNotas();
		
		menor = Notas.dameMenor();
		notamenor = Notas.dameNota(menor);
		System.out.println("\nAlumno con MENOR nota");
		System.out.println("=====================");
		System.out.println("Alumno "+ (menor+1) + ": "+ notamenor);
	}

}
