package misClases.avaliacion3;

public class ClaseD extends ClaseA{
	
	public int atributo_x = 4;
	
	public int m�todo_x() {
		
		System.out.println("M�todo x de la Clase D");
		return atributo_x  * -10;
	}
	
	public int m�todo_x(int a) {
		
		System.out.println("M�todo x(int) de la Clase D");
		return super.atributo_x * - a;
	}
	
	public int m�todo_z() {
		
		System.out.println("M�todo z de la Clase D");
		
		return atributo_x * -20;
	}

}
