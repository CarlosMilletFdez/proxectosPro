package compilador50_55;

import java.util.Scanner;
import java.io.IOException;

public class compi54 {

	public static void main(String[] args) throws IOException {

		int num=0;
		float r;
		char cadea;
		Scanner teclado = new Scanner(System.in);

		System.out.println("MENU");
		System.out.println("=======");
		System.out.println("1.-Dame un ENTEIRO");
		System.out.println("2.-Dame un REAL");
		System.out.println("3.-Dame unha CADEA");
		System.out.println("4.-FINAL");
		num = teclado.nextInt();
		
		while (num!=4) {

			switch (num) {

			case 1:
				System.out.print("Dame un numero enteiro:");
				num = teclado.nextInt();
				System.out.print("\nNúmero enteiro: " + num);
				break;

			case 2:
				System.out.print("Dame un numero real.");
				r = teclado.nextFloat();
				System.out.print("\nNúmero real:" + r);
				break;

			case 3:
				System.out.print("Dame unha cadea.");
				cadea = (char) System.in.read();

				while (cadea != '\n') {	
				System.out.print(cadea);
				cadea = (char) System.in.read();
				}
				break;

			case 4:
				
				break;
			
			default:
				System.out.println("OPCION Erronea");
				break;
			}
			
			System.out.println("\nMENU");
			System.out.println("=======");
			System.out.println("1.-Dame un ENTEIRO");
			System.out.println("2.-Dame un REAL");
			System.out.println("3.-Dame unha CADEA");
			System.out.println("4.-FINAL");
			num = teclado.nextInt();
		}
		System.out.println("FINAL");
		teclado.close();
	}
}
