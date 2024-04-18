package compilador17_25;

public class compi20 {

	public static void main(String[] args) {

		int num1, num2, suma;
		num1 = 0;
		num2 = 0;
		suma = 1;
		while (suma < 1000) {
			System.out.println(suma);
			num1 = num2;
			num2 = suma;
			suma = num1 + num2;
		}
	}
}