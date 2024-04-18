package teoria.capitulo03;

import misClases.teoria.CEcuacion;

public class CApEcuacion {

	public static void main(String[] args) {
		
		double resultado;
		CEcuacion ecuacion=new CEcuacion();
		ecuacion.Ecuacion(1, -3.2,  0, 7);
		resultado = ecuacion.ValorPara(1);
		System.out.println("O resultado para x=1 é "+ resultado);
		resultado = ecuacion.ValorPara(1.5);
		System.out.println("O resultado para x=1,5 é "+ resultado);
		
	}

}
