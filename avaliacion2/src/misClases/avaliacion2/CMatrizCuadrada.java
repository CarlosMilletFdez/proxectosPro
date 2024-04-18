package misClases.avaliacion2;

public class CMatrizCuadrada {

	private int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
	private int[][] matrizA = {{1,2,3},{4,5,6},{7,8,9}};
	private int[][] matrizB = new int[3][3];

	public void amosaDereitaAbaixo() {//216

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void amosaDereitaArriba() {//217
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[2-i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void amosaEsquerdaAbaixo() {//218
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][2-j] + " ");
			}
			System.out.println();
		}
	}
	
	public void amosaEsquerdaArriba() {//219
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[2-i][2-j] + " ");
			}
			System.out.println();
		}
	}

	public void amosaArribaDereita() {//220
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + matriz[j][2-i]);
			}
			System.out.println();
		}
	}
	
	public void amosaArribaEsquerda() {//221
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + matriz[2-j][2-i]);
			}
			System.out.println();
		}	
	}
	
	public void amosaAbaixoDereita(){//222
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + matriz[j][i]);
			}
			System.out.println();
		}	
	}
	
	public void amosaAbaixoEsquerda() {//223
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + matriz[2-j][i]);
			}
			System.out.println();
		}	
	}
	
	public void copiaAenBcolumna1Repe() {//prepara01
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizB[i][j]= matrizA[j][2*(i%2)];
			}
		}
	}
	
	public void amosa(char letra){//prepara06
		
		int [][] m= null;
		if (letra=='A') 
			m = matrizA;
		else if (letra=='B')
			m = matrizB;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) 
				System.out.print(" " + m[i][j] + " ");
			System.out.println();
		}
		System.out.println();		
	}
	
	public void copiaAenBfila2Repe() {//prepara06
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizB[i][j]= matrizA[1-j/2][2-i];
			}
		}
	}
	
	public void copiaAenBfila3Repe() {//prepara08
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizB[i][j]= matrizA[1+(j%2+j/2)][2-i];
			}
		}
	}
	
	public void pregunta2() {//pregunta2
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizB[i][j]= matrizA[j][2*(i%2)];
			}
		}
	}
	
	public void ternaria() {
		
		for(int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				matrizB[i][j]= matrizA[i==0?2: i==1?1: 0][j];
			}
		}
	}
	
}
