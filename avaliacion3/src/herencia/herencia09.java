package herencia;

import misClases.avaliacion3.ClaseA;
import misClases.avaliacion3.ClaseD;

public class herencia09 {

	public static void main(String[] args) {
		
		ClaseA objA;
		objA = new ClaseD();
	
		System.out.println(objA.m�todo_y());
		System.out.println(objA.m�todo_x());
		System.out.println(((ClaseD)objA).m�todo_x(10));

	}

}
