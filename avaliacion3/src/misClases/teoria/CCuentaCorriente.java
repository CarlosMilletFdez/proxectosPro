package misClases.teoria;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CCuentaCorriente extends CCuenta{

	private int transacciones;
	private double importePorTrans;
	private int transExentas;
	
	public CCuentaCorriente() {}
	
	public CCuentaCorriente(String nom, String cue, double sal, double tipo, double imptrans, int transex) {
		
		super(nom, cue, sal, tipo);
		transacciones=0;
		asignarImportePorTrans(imptrans);
		asignarTransExentas(transex);
	}
	
	public void decrementarTransacciones() {
		
		transacciones--;
	}
	
	public void asignarImportePorTrans(double imptrans) {
		
		if (imptrans < 0) {
			System.out.println("Error: cantidad negativa");
			return;
		}
		importePorTrans=imptrans;
	}
	
	public double obtenerImporteTrans() {
		return importePorTrans;
	}
	
	public void asignarTransExentas(int transex) {
		
		if(transex<0) {
			System.out.println("Error: cantidad negativa");
			return;
		}
		transExentas = transex;
	}
	
	public void ingreso(double cantidad) {
		
		super.ingreso(cantidad);
		transacciones++;
	}
	
	public void reintegro(double cantidad) {
		
		super.reintegro(cantidad);
		transacciones++;
	}
	
	@Override
	public void comisiones() {
		
		GregorianCalendar fechaActual= new GregorianCalendar();
		int d�a= fechaActual.get(Calendar.DAY_OF_MONTH);
		if (d�a==1) {
			int n= transacciones-transExentas;
			if (n>0)
				reintegro(n*importePorTrans);
			transacciones=0;
		}
		
	}

	@Override
	public double intereses() {

		GregorianCalendar fechaActual = new GregorianCalendar();
		int d�a =fechaActual.get(Calendar.DAY_OF_MONTH);
		if (d�a!=1)
			return 0.0;
		double interesesProducidos=0.0;
		if(estado() <=3000)
			interesesProducidos=estado()*0.5/1200.0;
		else {
			interesesProducidos=3000*obtenerTipoDeInter�s()/1200.0;
		}
		ingreso(interesesProducidos);
		decrementarTransacciones();
		return interesesProducidos;
	}
	
	
}
