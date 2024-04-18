package ejemplos;

public class AppEjemplo {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjemploStaticYFinal ejemplo1 = new EjemploStaticYFinal();
		EjemploStaticYFinal ejemplo2 = new EjemploStaticYFinal();

		ejemplo1.i = 22;
		ejemplo2.i = 132423;
		EjemploStaticYFinal.static_i = 33;
		
		System.out.println("ejemplo 1 " + ejemplo1.i + " " + EjemploStaticYFinal.static_i);
		
		System.out.println("ejemplo 2 " + ejemplo2.i + " " + EjemploStaticYFinal.static_i);

		// ---- final
		
		// ejemplo1.final_i = 78;
		// ejemplo1.static_final_i = 11;
		
		System.out.println(ejemplo1.final_i);
		System.out.println(EjemploStaticYFinal.static_final_i);

		System.out.println(ejemplo2.final_i);
		System.out.println(EjemploStaticYFinal.static_final_i);
	}

}
