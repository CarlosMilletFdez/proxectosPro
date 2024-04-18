package examen2023;

public class CSerie {

	//private int num;

	public void amosaA_Bmulti34reves(int numeroA, int numeroB) {
		
		while (numeroA <= numeroB) {

			if (numeroB % 4 == 0 && numeroB % 3 ==0) {

				System.out.print("(3-4)." + numeroB +" ");
			}
			
			else if (numeroB % 4 == 0) {
				
				System.out.print( "(4)." + numeroB + " ");
	
			}
			else if (numeroB % 3 ==0) {
				
				System.out.print("(3)." + numeroB +" ");	
			}
			else {
				System.out.print(numeroB + " ");
				
			}
			
			numeroB = numeroB - 1;
		}
	}
}
