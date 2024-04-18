package misClases.avaliacion1;

import java.util.Scanner;

public class CHora {

	private int seg, min, hora;

	Scanner teclado = new Scanner(System.in);

	public void recogeSegundo() {

		System.out.print("Introduza os segundos: ");
		seg = teclado.nextInt();

		while (seg < 0 || seg > 59) {

			System.out.print("Introduza os segundos: ");
			seg = teclado.nextInt();

		}

	}

	public void recogeMinuto() {

		System.out.print("Introduza os minutos: ");
		min = teclado.nextInt();

		while (min < 0 || min > 59) {

			System.out.print("Introduza os minutos: ");
			min = teclado.nextInt();

		}

	}

	public void recogeHora() {

		System.out.print("Introduza a hora: ");
		hora = teclado.nextInt();

		while (hora < 0 || hora > 23) {

			System.out.print("Introduza a hora: ");
			hora = teclado.nextInt();

		}

	}

	private String seg() {
		String dato;
		if (seg < 10) {

			dato = "0" + seg;
		}

		else {
			dato = seg + "";
		}
		return dato;
	}

	private String min() {
		
		String dato;
		
		if (min < 10) {
			dato = "0" + min + ":";
		}

		else {
			dato = min + ":";
		}
		return dato;
	}

	private String hora() {

		String dato;

		if (hora < 10) {

			dato = "0" + hora + ":";
		}

		else {

			dato = hora + ":";
		}

		return dato;
	}

	public void amosaResultado() {

		System.out.print("Resultado: " + hora() + min() + seg());

	}

}
