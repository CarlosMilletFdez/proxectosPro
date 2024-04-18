package misClases.avaliacion1;

public class CSerie {

	private int num;

	public void amosa1_10() {

		for (num = 1; num <= 10; num = num + 1) {
			System.out.println(num);
		}
	}

	public void amosa10_1() {

		int num = 10;
		while (num >= 1) {
			System.out.println(num);
			num = num - 1;
		}
	}

	public void amosaAta20(int num) {

		for (; num <= 20; num = num + 1) {
			System.out.println(num);
		}
	}

	public void amosaDende20(int i) {

		num = 20;
		while (i <= num) {

			System.out.println(num);
			num = num - 1;
		}
	}

	public void amosaA_B(int a, int b) {

		while (a <= b) {
			System.out.println(a);
			a = a + 1;
		}
	}

	public void amosaB_A(int a, int b) {

		while (a <= b) {
			System.out.println(b);
			b = b - 1;
		}

	}

	public void amosaB_AsumaAimpares(int a, int b) {

		while (a <= b) {

			if (b % 2 == 1)

				System.out.print(a + "+");

			System.out.print(b + " ");
			b = b - 1;
		}
	}

	public void amosaA_BrestaBtres(int a, int b) {

		while (a <= b) {

			if (a % 3 == 0)
				System.out.print("(" + b + "-" + a + ") ");

			else
				System.out.print(a + " ");

			a = a + 1;
		}
	}

	public void amosaA_Bsuma500seis(int numeroA, int numeroB) {

		while (numeroA <= numeroB) {

			if (numeroA % 6 == 0) {

				System.out.print((numeroA + 500) + " ");
			}

			else if (numeroA % 2 == 0) {

				System.out.print(numeroA + " ");
			}

			numeroA = numeroA + 1;
		}

	}

	public void amosaA_Bmulti4partido(int numeroA, int numeroB) {

		while (numeroA <= numeroB) {

			if (numeroA % 4 == 0) {
				System.out.print("(" + (numeroA / 4) + "*4) ");
			}

			else {

				System.out.print(numeroA + " ");
			}

			numeroA = numeroA + 1;
		}
	}

	public void amosaB_Asuma4(int a, int b) {
		
		while (a <= b) {

			if (b % 4 == 0)

				System.out.print(b + 200);

			else 
				System.out.print( " " + b + " ");
				b = b - 1;
		}
	}
}
