package provisional;

import java.util.Scanner;


public class Matriz {
	public static void main(String[] args) {

		String[] combinacion = { "000", "001", "002", "010", "011", "012", "020", "021", "022", "100", "101", "102",
				"110", "111", "112", "120", "121", "122", "200", "201", "202", "210", "211", "212", "220", "221",
				"222" };

		String[] operacion = { "[j*0]", "([j-(j%2))/2]", "[j-(j%2)]", "[j%2]", "[((j+(j%2))/2]", "[j]", "[2*(i%2)]",
				"[-021-]", "[j+(j%2)]", "[((2-1)-(i%2))/2]", "[(i+((2-i) - (i%2))) -1]",
				"[(j - (j%2)) + (((2-j)-(j%2)) /2 )]", "[1-((j-(j%2))/2)]", "[1-(j+(2-j))]", "[((j+2)-(i%2))/2",
				"[(1+(j%2))-(j/2)]", "[1+(j%2)]", "[(j/2)+(1+(j%2))]", "[(2-j)-(j%2)]", "[(1+(j&2))-((j-(j%2))/2)]",
				"[2-(2(j%2)]", "[2-i]", "[(j-(j%2))+(2-j)]", "[j+((2-1)-(j%2))]", "[(2-j)+(j%2)]",
				"[1+(((2-j)+(j%2))/2)]", "[i+(2-i)]" };

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe la combinación:");
		String combinacionTecleada = scanner.next();
		for (int i = 0; i < combinacion.length; i++) {
			if (combinacionTecleada.equals(combinacion[i])) {
				System.out.println("COMBINACIÓN " + combinacionTecleada + " OPERACIÓN " + operacion[i]);

			}
		}
		scanner.close();
	}
	
}
