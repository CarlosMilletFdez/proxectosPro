package misClases.avaliacion2;

public class CArrayCadenas {

	private String[] vector = new String[7];

	public void inicializa() {

		vector[0] = "Lunes";
		vector[1] = "Martes";
		vector[2] = "Miercoles";
		vector[3] = "Jueves";
		vector[4] = "Viernes";
		vector[5] = "Sabado";
		vector[6] = "Domingo";
	}

	public void amosaArray() {

		for (int i = 0; i < vector.length; i++)
			System.out.println(vector[i]);
	}

	public void ordenaAscendente() {

		int i, j;
		String dato;
		if (vector[0] == null) {
			System.out.println("Inicializa o ARRAY.");
			return;
		}
		
		for (i = 0; i < vector.length; i++) {
			for (j = vector.length - 1; j > i; j--) {
				if (vector[j - 1].compareTo(vector[j]) > 0) {
					dato = vector[j - 1];
					vector[j - 1] = vector[j];
					vector[j] = dato;
				}
			}
		}
	}
	
	public void ordenaDescendente() {

		int i, j;
		String dato;
		if (vector[0] == null) {
			System.out.println("Inicializa o ARRAY.");
			return;
		}
		
		for (i = 0; i < vector.length; i++) {
			for (j = vector.length - 1; j > i; j--) {
				if (vector[j - 1].compareTo(vector[j]) < 0) {
					dato = vector[j - 1];
					vector[j - 1] = vector[j];
					vector[j] = dato;
				}
			}
		}
	}
}
