package herencia;

public class Gaviota extends Ave {

	int peso = super.peso * 2;
	
	public Gaviota(int peso) {
		super(peso);
		System.out.println("Constructor Gaviota");
	}

	public void caminar() {
		super.caminar(); 
		System.out.println("Gaviota camina. Peso gaviota: " + peso);
		System.out.println("Gaviota camina. Peso animal: " + super.peso);

	}
}
