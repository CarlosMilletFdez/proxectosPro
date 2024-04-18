package misClases.avaliacion2;

import misClases.teoria.Leer;

public class CMatrices {

	private int[][] A = new int[3][3];
	private int[][] B = new int[3][3];
	private int[][] C = new int[3][3];
	private int[][] D = new int[3][3];
	private int n;

	private int[][] dameReferencia(char letra) {

		int[][] M = null;
		if (letra == 'A' || letra == 'a')
			M = A;
		else if (letra == 'B' || letra == 'b')
			M = B;
		else if (letra == 'C' || letra == 'c')
			M = C;
		else if (letra == 'D' || letra == 'd')
			M = D;
		else
			System.err.print("Referencia inválida");

		return M;

	}

	public void recolle() {

		int i, j;

		System.out.print("Introduce dimension(2 o 3): ");
		n = Leer.datoInt();

		for (i = 0; i < n; i++)
			for (j = 0; j < n; j++) {
				System.out.print("A[" + i + "][" + j + "]= ");
				A[i][j] = Leer.datoInt();
			}
		
		for (i = 0; i < n; i++)
			for (j = 0; j < n; j++) {
				System.out.print("B[" + i + "][" + j + "]= ");
				B[i][j] = Leer.datoInt();
			}
	}

	public void amosa(char una, char dos) {

		int i, j = 0;
		int[][] M1 = dameReferencia(una);
		int[][] M2 = dameReferencia(dos);

		System.out.println(" ");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (M1[i][j] < 0|| M1[i][j]>=10 )
					System.out.print(M1[i][j] + "  ");
				else
					System.out.print(" " + M1[i][j] + "  ");
			}
			System.out.print("   ");
			
			for (j = 0; j < n; j++) {
				if (M2[i][j] < 0 || M2[i][j]>=10 )
					System.out.print(M2[i][j] + "  ");
				else
					System.out.print(" " + M2[i][j] + "  ");
			}
			System.out.println("   ");
		}
	}

	public void trasposta(char una, char dos) {
		int[][] M1 = dameReferencia(una);
		int[][] M2 = dameReferencia(dos);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				M2[j][i] = M1[i][j];
		}

	}

	public void suma(char una, char dos, char tres) {

		int[][] M1 = dameReferencia(una);
		int[][] M2 = dameReferencia(dos);
		int[][] M3 = dameReferencia(tres);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				M3[i][j] = M1[i][j] + M2[i][j];
		}

	}

	public void resta(char una, char dos, char tres) {

		int[][] M1 = dameReferencia(una);
		int[][] M2 = dameReferencia(dos);
		int[][] M3 = dameReferencia(tres);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				M3[i][j] = M1[i][j] - M2[i][j];

		}
	}

	public void multiplica(char una, char dos, char tres) {
		
		int[][] M1 = dameReferencia(una);
		int[][] M2 = dameReferencia(dos);
		int[][] M3 = dameReferencia(tres);
		int i,j,k;

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				M3[i][j]=0;
				
				for (k = 0; k < n; k++) {
					M3[i][j] = M3[i][j] + M1[i][k]*M2[k][j];
				}
				
			}
			
		}
	}
}
