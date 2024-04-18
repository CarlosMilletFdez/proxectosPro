package misClases.utilidades;

public class DatosPersonales {

	private static String[] nombres = { "Juana", "Jos�", "Ram�n", "Marta", "Laura", "Carlos", "Manuel", "Luis", "Juan",
			"Ana", "Emi", "Alberto", "Chema", "Eugenia", "Julia" };
	private static String[] apellidos = { "Millet", "Blanco", "Fern�ndez", "Rey", "Cores", "Outeiral", "Doval", "P�rez",
			"Casais", "Mart�nez", "Parada", "Gonz�lez", "Rego", "Hern�ndez", "S�nchez", "Feij�o", "Abascal", "Trump",
			"Biden", "Castro" };

	public static String dameNombre() {
		int i;
		i = (int) (nombres.length * Math.random());

		return nombres[i];
	}

	// (int)(sup-inf + 1)*Math.random() + inf;

	public static String dameApellido() {
		int i;
		i = (int) (apellidos.length * Math.random());
		return apellidos[i];
	}

}
