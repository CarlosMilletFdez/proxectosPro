package herencia;

public class App {

	public static void main(String[] args) {
		
		Ave gaviota = new Gaviota(2);
		gaviota.caminar(); // 1
		
//		System.out.println(" gaviota >" + gaviota.peso); // 2kg
//		
//		System.out.println(" (Gaviota)gaviota >" + ((Gaviota)gaviota).peso); // 5kgs
//		
//		Ave paloma = new Gaviota(2);
//		
//		// System.out.println(" (Gaviota)paloma >" + ((Gaviota)paloma).peso); // error
//		System.out.println(" (Ave)paloma >" + ((Ave)paloma).peso); // 2kg
//		System.out.println(" (Animal)paloma >" + ((Animal)paloma).peso); // 2kg

	}

}
