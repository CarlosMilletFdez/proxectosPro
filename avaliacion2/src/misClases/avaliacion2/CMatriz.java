package misClases.avaliacion2;

public class CMatriz {

	private int[][] matriz = new int[2][3];

	public void inicializa() {//piza209

		matriz[0][0] = 6;
		matriz[0][1] = 9;
		matriz[0][2] = 8;
		matriz[1][0] = 4;
		matriz[1][1] = 7;
		matriz[1][2] = 3;
	}

	public void amosaPorFilas() {//piza209

		int i, j;

		for (i = 0; i < 2; i++) {

			for (j = 0; j < 3; j++) 
				System.out.print(" " + matriz[i][j] + " ");
		
			System.out.println("");
		}
	}

	public void amosaPorColumnas() {//piza210

		int i, j;

		for (j = 0; j < 3; j++) {

			for (i = 0; i < 2; i++) 
				System.out.print(" " + matriz[i][j] + " ");
			
			System.out.println("");
		}
	}

	public void amosaPorFilasTotal() {//piza211

		int i, j, totalFila;

		for (i = 0; i < 2; i++) {
			totalFila = 0;
			for (j = 0; j < 3; j++) {
				totalFila = totalFila + matriz[i][j];
				System.out.print(" " + matriz[i][j] + " ");
			}
			System.out.println("(total: " + totalFila + ")");
		}
	}

	public void amosaPorColumnasTotal() {//piza212

		int i, j, totalColumnas;

		for (j = 0; j < 3; j++) {
			totalColumnas = 0;
			for (i = 0; i < 2; i++) {
				totalColumnas = totalColumnas + matriz[i][j];
				System.out.print(" " + matriz[i][j] + " ");
			}
			System.out.println("(total: " + totalColumnas + ")");
		}
	}
	
	public int oMaior () {//piza213
		
		int i, j, maior=matriz[0][0];
		
		for (i = 0; i < 2; i++) 

			for (j = 0; j < 3; j++) 

				if (matriz[i][j]>maior)
					
					maior= matriz[i][j];	
		
		return maior;
	}
	
	public void amosaFilaMaior() {//piza214
		
		int i, j, totalFilaActual, totalFilaMaior=0, indiceFilaMaior=0;

		for (i = 0; i < 2; i++) {
			
			totalFilaActual = 0;
			
			for (j = 0; j < 3; j++) 

				totalFilaActual = totalFilaActual + matriz[i][j];
			
			if (totalFilaActual>totalFilaMaior) {
				totalFilaMaior = totalFilaActual;
				indiceFilaMaior = i;
			}	
		}
		
		System.out.println("Fila Maior");
		System.out.println("==========");
		
		for (j=0; j<3;j++) 
				System.out.print(matriz[indiceFilaMaior][j] + "   ");	
	}
	
	public void amosaColumnaMaior () {//215
		
		int i, j, totalColumnaActual, totalColumnaMaior=0, indiceColumnaMaior=0;

		for (j = 0; j < 3; j++) {
			
			totalColumnaActual = 0;
			
			for (i = 0; i < 2; i++) {
				
				totalColumnaActual=totalColumnaActual + matriz[i][j];
				
				if (totalColumnaActual>totalColumnaMaior) {
				
					totalColumnaMaior = totalColumnaActual;
					indiceColumnaMaior = j;
				}	
			}		
		}
		
		System.out.println("Columna Maior");
		System.out.println("=============");
		
		for (i=0; i<2;i++) 
				
					System.out.println("      " + matriz[i][indiceColumnaMaior]);
	}
}
