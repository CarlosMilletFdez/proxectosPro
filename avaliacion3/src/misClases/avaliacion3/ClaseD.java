package misClases.avaliacion3;

public class ClaseD extends ClaseA{
	
	public int atributo_x = 4;
	
	public int método_x() {
		
		System.out.println("Método x de la Clase D");
		return atributo_x  * -10;
	}
	
	public int método_x(int a) {
		
		System.out.println("Método x(int) de la Clase D");
		return super.atributo_x * - a;
	}
	
	public int método_z() {
		
		System.out.println("Método z de la Clase D");
		
		return atributo_x * -20;
	}

}
