package pizarra37_42;

import misClases.avaliacion1.CNotas;

public class piza40 {

	public static void main(String[] args) {
		
		CNotas Notas=new CNotas();
		int maior;
		float notamaior;
		
		Notas.mostraNotas();
		
		maior = Notas.dameMaior();
		notamaior = Notas.dameNota(maior);
		System.out.println("\nAlumno con MAIOR nota");
		System.out.println("=====================");
		System.out.println("Alumno " + (maior+1) + ": " + notamaior);
	}

}
