package PruebasJUnit;

public class Calculadora {
	private float num1;
	private float num2;
	
	public Calculadora(float a, float b) {
		num1 = a;
		num2 = b;
	}
	public float sumar() {
		float resul = num1 + num2;
		return resul;
	}
	public float restar() {
		float resul = num1 - num2;
		return resul;
	}
	public float multiplicar() {
		float resul = num1 * num2;
		return resul;
	}
	public float dividir() {
		float resul = num1 / num2;
		return resul;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora cal1=new Calculadora(2, 4);
		//Ejemplo 1
		System.out.println("EJEMPLO 1");
		System.out.println("**********");
		System.out.println("La suma es: "+ cal1.sumar());
		System.out.println("La resta es: "+ cal1.restar());
		System.out.println("La multiplicación es: "+ cal1.multiplicar());
		System.out.println("La división es: "+ cal1.dividir());
		System.out.println("");
		
		Calculadora cal2=new Calculadora(124.48f, -5.74f);
		//Ejemplo 2
		System.out.println("EJEMPLO 2");
		System.out.println("**********");
		System.out.println("La suma es: "+ cal2.sumar());
		System.out.println("La resta es: "+ cal2.restar());
		System.out.println("La multiplicación es: "+ cal2.multiplicar());
		System.out.println("La división es: "+ cal2.dividir());
	}

}
