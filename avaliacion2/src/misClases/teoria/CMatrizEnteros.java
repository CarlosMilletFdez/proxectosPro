package misClases.teoria;

public class CMatrizEnteros {

	private int[] matriz;

	public void crea() {
		int nElementos;
		System.out.print("Numero de enteros: ");
		nElementos = Leer.datoInt();
		matriz = new int[nElementos];
	}

	private int dameDato() {
		int dato;
		dato = (int) ((50 - 20 + 1) * Math.random() + 20);

		return dato;
	}

	public void llena() {

		for (int i = 0; i < matriz.length; i++)
			matriz[i] = dameDato();
	}

	public void amosa() {

		int n = 0;
		System.out.println("Matriz de Enteros");
		while (n < matriz.length) {
			System.out.print(matriz[n] + " ");
			n++;
		}
	}
}
