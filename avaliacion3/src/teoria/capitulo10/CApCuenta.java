package teoria.capitulo10;

import misClases.teoria.CCuentaAhorro;

public class CApCuenta {

	public static void main(String[] args) {
		
//		primerCliente();
//		segundoCliente();
//
//	}
//
//	public static void primerCliente() throws ESaldoInsuficiente {
		
		CCuentaAhorro cliente01 = new CCuentaAhorro();
		cliente01.asignarNombre("Amancio Couso Arias");
		cliente01.asignarCuenta("123456789");
		cliente01.asignarTipoDeInter�s(2.5);
		cliente01.asignarCuotaManten(300);
		cliente01.ingreso(1000000);
		cliente01.reintegro(500000);
		cliente01.comisiones();
	}
	
	
}
