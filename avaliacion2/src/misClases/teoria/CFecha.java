package misClases.teoria;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CFecha {
	
	//Atributos
	private int día, mes, año;
	
	public CFecha () {
		asignarFecha();
	}
	
	public CFecha(int dd) {
		asignarFecha();
		día=dd;
		if (!fechaCorrecta()) {
			System.out.println("Fecha incorrecta. Se asigna la actual.");
			asignarFecha();
		}
	}
	
	public CFecha(int dd, int mm) {
		asignarFecha();
		día = dd; mes = mm;
		if (!fechaCorrecta()) {
			System.out.println("Fecha incorrecta. Se asigna la actual.");
			asignarFecha();
			}
		}
	
	public CFecha(int dd, int mm, int aaaa) {
		asignarFecha();
		día = dd; mes = mm; año=aaaa;
		if (!fechaCorrecta()) {
			System.out.println("Fecha incorrecta. Se asigna la actual.");
			asignarFecha();
			}
		}
	
	public CFecha(CFecha obj) { //contructor copia
		día= obj.día;
		mes = obj.mes;
		año = obj.año;	
	}
	
	protected void finalize() throws Throwable{
		
	}
	
	protected boolean bisiesto() {
		
		return ((año % 4 == 0) && (año % 100 !=0) || (año % 400 ==0));
	}
	
	public void asignarFecha() {
		GregorianCalendar fechaActual = new GregorianCalendar();
		día= fechaActual.get(Calendar.DAY_OF_MONTH);
		mes= fechaActual.get(Calendar.MONTH)+1;
		año= fechaActual.get(Calendar.YEAR);
	}
	
	public void asignarFecha(int dd) {
		asignarFecha();
		día=dd;
	
	}
	
	public void asignarFecha(int dd, int mm) {
		asignarFecha();
		día=dd;
		mes=mm;
	}
	
	public void asignarFecha(int dd, int mm, int aaaa) {
		asignarFecha();
		día = dd;
		mes = mm;
		año = aaaa;
	}
	
	public void obtenerFecha(int[] fecha) {
		
		fecha[0]= día;
		fecha[1]= mes;
		fecha[2]= año;
		
	}
	
	public boolean fechaCorrecta() {
		
		boolean díaCorrecto, mesCorrecto, añoCorrecto;
		añoCorrecto = (año>= 1582);
		mesCorrecto = (mes>= 1) && (mes<=12);
		switch(mes){
		
		case 2: 
			if (bisiesto())
				díaCorrecto = (día >= 1 && día <=29);
			else 
				díaCorrecto = (día >= 1 && día <=28);
			break;
			
		case 4: case 6: case 9: case 11:
			díaCorrecto = (día>= 1 && día <=30);
			break;
			
		default:
			díaCorrecto = (día>= 1 && día <=31);
		}
		return díaCorrecto && mesCorrecto && añoCorrecto;
	}
	
	public CFecha copiar(CFecha obj) {
		día = obj.día;
		mes = obj.mes;
		año = obj.año;
		return this;
		
	}

}
