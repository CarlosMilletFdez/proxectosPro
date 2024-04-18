package misClases.utilidades;

public class DatosPersonales {

	private static String[] nombres = { "Juana", "José", "Ramón", "Marta", "Laura", "Carlos", "Manuel", "Luis", "Juan",
			"Ana", "Emi", "Alberto", "Chema", "Eugenia", "Julia" };
	private static String[] apellidos = { "Millet", "Blanco", "Fernández", "Rey", "Cores", "Outeiral", "Doval", "Pérez",
			"Casais", "Martínez", "Parada", "González", "Rego", "Hernández", "Sánchez", "Feijóo", "Abascal", "Trump",
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
