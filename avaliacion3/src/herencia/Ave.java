package herencia;

public abstract class Ave extends Animal {

	public Ave() {
		super();
		}
	
	public Ave(int peso ) {
		super(peso);
		System.out.println("Constructor Ave");

	}

	void volar() {
		System.out.print("Ave vuela");
	}

	public void caminar() {
		super.caminar();
		System.out.println("Ave camina. Peso: " + peso);

	}
}
