package herencia;

import misClases.avaliacion3.*;

public class herencia06 {

	public static void main(String[] args) {
		
		ClaseA[] a = new ClaseA[3];
		int i;
		
		a[0]=new ClaseB();
		a[1]=new ClaseC();
		a[2]=new ClaseD();
		
		for (i=a.length-1; i >= 0; i--)
			System.out.println(a[i].método_x());
	}
}
