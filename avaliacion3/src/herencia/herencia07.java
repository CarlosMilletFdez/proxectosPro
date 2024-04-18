package herencia;

import misClases.avaliacion3.*;

public class herencia07 {

	public static void main(String[] args) {

		ClaseA[] a = {new ClaseB(), new ClaseC(), new ClaseD()};
		int i;
		for (i=a.length-1; i >= 0; i--)
			System.out.println(a[i].método_x());

	}

}
