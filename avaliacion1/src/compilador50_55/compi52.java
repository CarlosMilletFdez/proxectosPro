package compilador50_55;

import java.util.Scanner;

public class compi52 {

	public static void main(String[] args) {

		int num;
		Scanner teclado = new Scanner(System.in);

		System.out.println("MENU");
		System.out.println("=======");
		System.out.println("1.-Amoso UNHA");
		System.out.println("2.-Amoso DUAS DUAS");
		System.out.println("3.-Amoso TRES TRES TRES");
		num = teclado.nextInt();

		while (num >= 1 && num <= 3) {
			
			switch (num) {
			case 1:
				System.out.println("UNHA");
				break;
			case 2:
				System.out.println("DUAS DUAS");
				break;
			case 3:
				System.out.println("TRES TRES TRES");
				break;
			}
			System.out.println("MENU");
			System.out.println("=======");
			System.out.println("1.-Amoso UNHA");
			System.out.println("2.-Amoso DUAS DUAS");
			System.out.println("3.-Amoso TRES TRES TRES");
			num = teclado.nextInt();
			
		}
			
		teclado.nextLine();
		System.out.println("FINAL");

		teclado.close();

	}

}
