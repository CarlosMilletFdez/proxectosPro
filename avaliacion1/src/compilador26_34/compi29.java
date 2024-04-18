package compilador26_34;

public class compi29 {

	public static void main(String[] args) {
		int num1 = 0 , num2 = 0, suma = 1;
		for (; suma < 1000; suma = num1 + num2) {
			System.out.println(suma);
			num1 = num2;
			num2 = suma;
		}
	}
}
