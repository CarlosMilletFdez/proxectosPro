package misClases.teoria;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CCuentaCorrienteConIn extends CCuentaCorriente {
	
	public CCuentaCorrienteConIn() {}

	public CCuentaCorrienteConIn(String nom, String cue, double sal, double tipo, double imptrans, int transex) {
		
		super(nom, cue, sal, tipo, imptrans, transex);
	}
	
	public double intereses() {
		
		GregorianCalendar fechaActual = new GregorianCalendar();
		int día= fechaActual.get(Calendar.DAY_OF_MONTH);
		
		if (día!=1 ||estado()<3000)
			return 0.0;
		double interesesProducidos=0.0;
		interesesProducidos=estado()*obtenerTipoDeInterés()/1200.0;
		ingreso(interesesProducidos);
		decrementarTransacciones();
		return interesesProducidos;
	}
}
