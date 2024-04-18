package misClases.teoria;

public class CBanco {
	
	private CCuenta[] clientes;
	private int nElementos;
	
	public CBanco() {
		
		nElementos = 0;
		clientes = new CCuenta[nElementos];
	}
	
	private void unElementoMás(CCuenta[] clientesActuales) {
		
		nElementos = clientesActuales.length;
		clientes = new CCuenta[nElementos +1];
		for (int i =0; i < nElementos;i++)
			clientes[i] = clientesActuales[i];
		nElementos++;
	}
	
	private void unElementoMenos(CCuenta [] clientesActuales) {
		if (clientesActuales.length ==0)
			return;
		int k=0;
		nElementos = clientesActuales.length;
		clientes= new CCuenta[nElementos -1];
		for (int i =0; i <nElementos; i++)
			if (clientesActuales[i] != null)
				clientes[k++]=clientesActuales[i];
		nElementos--;
	}
	
	public void insertarCliente(int i, CCuenta objeto) {
		if (i>=0 && i<nElementos)
			clientes[i]=objeto;
		else 
			System.out.println("Índice fuera de límites");
	}
	
	public CCuenta clienteEn (int i) {
		if(i>=0 && i<nElementos)
			return clientes[i];
		else {
			System.out.println("Índice fuera de límites");
			return null;
		}
	}

	public int longitud() {
		return nElementos;
	}
	
	public void añadir(CCuenta obj) {
		unElementoMás(clientes);
		insertarCliente(nElementos - 1, obj);
	}
	
	public boolean eliminar(String cuenta) {
		for (int i=0; i<nElementos;i++)
			if(cuenta.compareTo(clientes[i].obtenerCuenta())==0) {
				clientes[i]=null;
				unElementoMenos(clientes);
				return true;
			}
		return false;
	}
	
	public int buscar(String str, int pos) {
		
		String nom, cuen;
		if(str==null)
			return -1;
		if(pos<0)
			pos=0;
		for(int i=pos;i<nElementos;i++) {
			nom=clientes[i].obtenerNombre();
			if (nom==null)
				continue;
			if(nom.indexOf(str)>-1)
				return i;
		}
		return -1;
	}
	
}
