package practicas1_4;

public class practica2 {

	public static void main(String[] args)  {
		
		int codigoAscciInicio = 32;
		int codigoAsciiFin = 126;
		for (int cod = codigoAscciInicio; cod <= codigoAsciiFin; cod++) {

			if (cod%10==1) {
				
				System.out.println(cod + " "+ (char)cod + '\t' );
				System.out.println();
			}
			else if (cod <100) {
				
				System.out.print(" " + cod + " "+ (char)cod + '\t' );
			}
			else  {
				
				System.out.print(cod + " "+ (char)cod + '\t' );
			}
		}
	}
}

