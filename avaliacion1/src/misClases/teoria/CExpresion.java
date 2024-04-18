package misClases.teoria;

public class CExpresion {

	double a,b,c;
	
	public void AsignarDatos(double pa, double pb, double pc) {
		
		a=pa;
		b=pb;
		c=pc;
	}
	
	public void VisualizarResultado() {
		
		double resultado;
		resultado = (b*b - 4*a*c)/(2*a);
		System.out.println(resultado);
	}
	
}
