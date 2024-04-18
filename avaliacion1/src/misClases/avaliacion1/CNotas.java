package misClases.avaliacion1;

public class CNotas {

	private float[] notas = { 3.2F, 7.45F, 8.15F, 5.6F, 5.35F, 9.15F, 2.45F, 4.4F, 6.7F, 1.8F };

	public void mostraNotas() {

		int i;

		System.out.println("Relacion de NOTAS");
		System.out.println("=================");

		for (i = 0; i < 10; i++)
			System.out.println("Alumno " + (i + 1) + ": " + notas[i]);

	}

	public float dameNota(int i) {
		return notas[i];
	}

	public void mostraAprobados() {

		int i;

		System.out.println("\nRelación de APROBADOS");
		System.out.println("=====================");

		for (i = 0; i < 10; i++)
			if (notas[i] >= 5)
				System.out.println("Alumno " + (i + 1) + ": " + notas[i]);
	}

	public void mostraSuspensos() {

		int i;

		System.out.println("\nRelación de SUSPENSOS");
		System.out.println("=====================");

		for (i = 0; i < 10; i++)
			if (notas[i] < 5)
				System.out.println("Alumno " + (i + 1) + ": " + notas[i]);
	}

	public int dameMaior() {

		int i, imaior = 0;
		float notamaior = notas[0];

		for (i = 0; i < 10; i++) {

			if (notas[i] > notamaior) {

				imaior = i;
				notamaior = notas[i];
			}
		}
		return imaior;
	}

	public int dameMenor() {

		int i, imenor = 0;
		float notamenor = notas[0];

		for (i = 0; i < 10; i++) {

			if (notamenor > notas[i]) {
				notamenor = notas[i];
				imenor = i;
			}
		}
		return imenor;
	}

	public float dameNotaMedia() {

		int i;
		float totalnotas=0, medianotas = 0;

		for (i = 0; i < 10; i++) {

			totalnotas = totalnotas + notas[i];	
		}
		
		medianotas = totalnotas / (i + 1);
		return medianotas;
	}
}
