package herencia;

import misClases.avaliacion3.*;

public class herencia08 {

	public static void main(String[] args) {

		ClaseA objA;
		objA = new ClaseD();
	
		System.out.println(objA.m�todo_y());
		System.out.println(objA.m�todo_x());
		System.out.println(((ClaseD)objA).m�todo_z());

	}

}
