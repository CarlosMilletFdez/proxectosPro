package examePractico.avaliacion2;

public class CMatrizCuadrada {

	private int[][] matrizA = {{1,2,3},{4,5,6},{7,8,9}};
	private int[][] matrizB = new int[3][3];

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
	
	public void copiaAenB(){
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				matrizB[i][j]= matrizA[1+(j%2+j/2)][2-i];
			}
		}
	}
}
