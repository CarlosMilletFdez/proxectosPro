package misClases.teoria;

import java.util.Scanner;

public class CPrueba {

	private CGrados grados = new CGrados();

	public void RecogeGrados() {

		float centi;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame Grados Centigrados: ");
		centi = teclado.nextFloat();

		grados.CentigradosAsignar(centi);

		teclado.close();
	}

	public void AmosaGrados() {

		//float gradosfar, gradoscent;
		//gradoscent = grados.CentigradosObtener();
		//gradosfar = grados.FarenheitObtener();
		System.out.println(grados.CentigradosObtener() + " C " + grados.FarenheitObtener() + " F");

	}
}
