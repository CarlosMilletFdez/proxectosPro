package herencia;

import misClases.avaliacion3.ClaseA;
import misClases.avaliacion3.ClaseB;
import misClases.avaliacion3.ClaseC;
import misClases.avaliacion3.ClaseD;

public class herencia05 {

	public static void main(String[] args) {

		ClaseA aA;
		aA = new ClaseB();
		System.out.println(aA.m�todo_x());
		aA = new ClaseC();
		System.out.println(aA.m�todo_x());
		aA = new ClaseD();
		System.out.println(aA.m�todo_x());

	}

}
