package misClases.teoria;

public class CEcuacion {

	double a, b, c, d;

	public void Ecuacion(double pa, double pb, double pc, double pd) {
		// asignar valores
		a = pa;
		b = pb;
		c = pc;
		d = pd;
	}

	public double ValorPara(double x) {
		// resolver ecuacion
		double resultado;

		resultado = a * x * x * x + b * x * x + c * x + d;

		return resultado;
	}

}
