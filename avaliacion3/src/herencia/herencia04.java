package herencia;

import misClases.avaliacion3.ClaseA;
import misClases.avaliacion3.ClaseB;
import misClases.avaliacion3.ClaseC;
import misClases.avaliacion3.ClaseD;

public class herencia04 {

	public static void main(String[] args) {

		ClaseA aB, aC, aD;
		aB = new ClaseB();
		aC = new ClaseC();
		aD = new ClaseD();
		System.out.println(aB.m�todo_x());
		System.out.println(aC.m�todo_x());
		System.out.println(aD.m�todo_x());

	}

}
