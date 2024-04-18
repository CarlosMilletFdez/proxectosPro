package teoria.capitulo04;

import misClases.teoria.CCuenta;

class CApCuenta {

	public static void main(String[] args) {
		
		CCuenta Cuenta01 = new CCuenta();
		
		
		Cuenta01.IngresarDinero(1000000);
		System.out.println(Cuenta01.SaldoActual());
		Cuenta01.IngresarDinero(300000);
		System.out.println(Cuenta01.SaldoActual());
		Cuenta01.EstablecerTipoDeInteres(5);
		Cuenta01.AbonarIntereses();
		System.out.println(Cuenta01.SaldoActual());
	

	}

}
