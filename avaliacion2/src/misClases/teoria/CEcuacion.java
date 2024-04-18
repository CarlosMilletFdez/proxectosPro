package misClases.teoria;

public class CEcuacion {

	private double a, b, c, d;

	public void recogeDatos() {

		System.out.print("Coeficiente de a: ");
		a = Leer.datoDouble();
		System.out.print("Coeficiente de b: ");
		b = Leer.datoDouble();
		System.out.print("Coeficiente de c: ");
		c = Leer.datoDouble();
		

	}

	public boolean raicesComplejas() {

		d = b*b - 4*a*c;
		return d < 0;

	}

	public void muestraResultado() {

		if (raicesComplejas()) {
			System.out.println("Las raices son complejas.");
		}

		else {
			System.out.println("Las raices reales son: ");
			System.out.print("x1 = " + (-b + Math.sqrt(d)) / (2 * a)+", ");
			System.out.print("x2 = " + (-b - Math.sqrt(d)) / (2 * a));
		}
	}
}