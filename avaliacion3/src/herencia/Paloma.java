package herencia;

public class Paloma extends Ave {
	int peso = 3;
	
	public Paloma(int peso) {
		super(peso);
	}

	public void caminar() {
		super.caminar();
		System.out.println("Paloma camina. Peso: " + peso);
	}
}
