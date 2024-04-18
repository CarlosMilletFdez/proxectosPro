package misClases.teoria;

	class Punto{
		
		private double x,y;
		
		Punto(double cx, double cy){
			x=cx;
			y=cy;
		}
	}
	
	public class CCirculo{
		
		private static double pi = 3.141592;
		public static int numC�rculos;
		public static double seno[] = new double[360];
		public static double coseno[] = new double[360];
		
		private Punto centro;
		private double radio;
		
		static {
			
			for (int i = 0; i < 360; i++) {
				double s,c;
				s=Math.sin(Math.toRadians(i));
				c=Math.cos(Math.toRadians(i));
				seno[i]= Math.rint(s*1000000)/1000000;
				coseno[i]= Math.rint(c*1000000)/1000000;
			}
		}
		
		protected void msgEsNegativo() {
			
			System.out.println("El radio es negativo. Se convierte a positivo");
		}
		
		public CCirculo() {
			
			this(100.0, 100.0, 100.0);
		}
		
		public CCirculo(double cx, double cy, double r) {
			
			centro = new Punto(cx, cy);
			if ( r<0) {
				msgEsNegativo();
				r=-r;
			}
			radio=r;
			numC�rculos++;
		}
		
		public double longCircunferencia() {
			
			return 2*pi*radio;
		}
		
		public double areaCirculo() {
			
			return pi*radio*radio;
		}
		
		public static void cambiarPrecisi�nPiA(double nuevoValor){
			
			if( nuevoValor < 3.14 || nuevoValor> 3.1416)
				return;
			pi= nuevoValor;
			
		}
		
		public static double damePi(){
	
			return pi;
		}

		
}
