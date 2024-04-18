package misClases.teoria;

import java.util.Arrays;

public class CVector {
	
	private double[] vector;
	private int nElementos;
	
	public CVector() {
		nElementos = 10;
		vector = new double[nElementos];
		
	}
	
	public CVector(int ne) {
		
		if(ne<1) {
			System.out.println("Nº de elementos no válido: " + ne);
			System.out.println("Se asignan 10 elementos");
			ne=10;
		}
		nElementos= ne;
		vector= new double[nElementos];
		
	}
	
	public CVector(double[] m) {
		
		nElementos = m.length;
		vector = new double[nElementos];
		for (int i= 0;i<nElementos;i++)
			vector[i]=m[i];
		
	}
	
	public CVector(CVector v) {
		nElementos = v.nElementos;
		vector = new double[nElementos];
		for( int i = 0; i<nElementos; i++)
			vector[i] = v.vector[i];
	}
	
	public CVector copiar(CVector v) {
		nElementos = v.nElementos;
		vector = new double[nElementos];
		for(int i =0; i < nElementos; i++)
			vector [i]= v.vector[i];
		return this;
	}
	
	public void ponerValorEn(int i, double valor) {
		vector[i]=valor;
	}
	
	public double valorEn(int i) {
		
		return vector[i];
	}
	
	public int longitud() {
		
		return nElementos;
	}
	
	public boolean equals(CVector v) {
		
		return Arrays.equals(vector, v.vector);
	}

}
