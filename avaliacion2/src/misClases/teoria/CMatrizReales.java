package misClases.teoria;

public class CMatrizReales {
		
		private float[] matriz;

		public void crea() {
			
			int nElementos;
			System.out.print("Numero de elementos de la matriz: ");
			nElementos = Leer.datoInt();
			matriz = new float[nElementos];
		}
		
		public int dameIndice() {
			int indice=0;
			
			System.out.println("Modificamos elemento");
			do {
				
			System.out.print("Dame índice: ");
			indice = Leer.datoInt();
			
			}
			
			while (indice >= matriz.length || indice<0);
			
			return indice;
				
		}

		private float dameDato() {
			float dato;
			dato = (float) ((9.99 - 0.0 + 1) * Math.random());

			return dato;
		}

		public void llena() {
			
			dameDato();
			for (int i = 0; i < matriz.length; i++)
				matriz[i] = dameDato();
		}

		public void amosa() {

			int n = 0;
			System.out.println("Matriz de Reales");
			while (n < matriz.length) {
				System.out.println(n + "-> " + matriz[n]);
				n++;
			}
			System.out.println(" ");
		}
		
		public void modificaElemento(int indice) {

			
			matriz[indice] = dameDato();
		}

}
