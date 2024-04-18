package misClases.avaliacion1;

import java.util.Scanner;

public class CFecha {

	private int dia, mes, ano;

	Scanner teclado = new Scanner(System.in);

	public void recogeDia() {

		System.out.print("Introduza un día: ");
		dia = teclado.nextInt();

		while (dia < 1 || dia > 31) {

			System.out.print("Introduza un día: ");
			dia = teclado.nextInt();

		}

	}

	public void recogeMes() {

		System.out.print("Introduza un mes: ");
		mes = teclado.nextInt();

		while (mes < 1 || mes > 12) {

			System.out.print("Introduza un mes: ");
			mes = teclado.nextInt();

		}

	}

	public void recogeAño() {

		System.out.print("Introduza un ano: ");
		ano = teclado.nextInt();

		while (ano < 1990 || ano > 2010) {

			System.out.print("Introduza un ano: ");
			ano = teclado.nextInt();

		}

	}

	private String dia() {
		String dato;
		if (dia < 10) {

			dato = "0" + dia + "/";
		}

		else {
			dato = dia + "/";
		}
		return dato;
	}

	private String mes() {
		
		String dato;
		
		if (mes < 10) {
			dato = "0" + mes + "/";
		}

		else {
			dato = mes + "/";
		}
		return dato;
	}

	private String ano() {

		String dato;

		if (ano < 2000) {

			ano = ano - 1900;
		}

		else {

			ano = ano - 2000;
		}

		if (ano < 10)
			dato = "0" + ano;

		else
			dato = "" + ano;

		return dato;
	}

	public void amosaResultado() {

		System.out.print("Resultado: " + dia() + mes() + ano());

	}

}
