package teoria.capitulo04;

import misClases.teoria.CComputador;

class CApComputador {

	public static void main(String[] args) {
		
		CComputador computador1 = new CComputador();
		CComputador computador2 = new CComputador();
		
		CComputador.EstablecerGarantia((byte)3);
		
		computador1.modificar("Ast", "Intel Pentium", "TFT"/*, (byte) 3*/);//hay que hacer un casteo a byte porque la garantia esta definida como tipo byte (el parametro garantia del metodo modificar) y el valor literal del numero lo pilla como un int por defecto 
		computador2.modificar("HP", "AMD", "CRT"/*, (byte) 3*/);

		computador1.EncenderOrdenador();
		computador1.Estado();
		computador1.ApagarOrdenador();
		computador1.Estado();
		
		computador2.EncenderOrdenador();
		computador2.Estado();
		computador2.ApagarOrdenador();
		computador2.Estado();

	}

}
