package misClases.avaliacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CArrayCaracteres {

	private int n=50;
	private char[] aCar= new char[n];
	
    public void recolle() {
        System.out.println("Introduce unha cadea de caracteres:");
        try {
        	InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);
            flujoE.read(aCar, 0, aCar.length);
        } catch (IOException e) {
            System.err.println("Error");
        }
    }
	
    public void amosa() {
    	
        for (int i = 0; aCar[i]!='\0'; i++) {
            System.out.print(aCar[i]);
        }
    }
	
    public void maiusculas() {
    	int desp = 'a'-'A';
    	for (int i=0; aCar[i]!='\0'; i++) {
    		if(aCar[i]>= 'a' && aCar[i]<='z' || aCar[i]=='ñ')
    			System.out.print((char)(aCar[i] - desp)); 
    		else 
    			System.out.print(aCar[i]);
    	}
    	
    }
    
    public void minusculas() {
    	
    	int desp = 'a'-'A';
    	for (int i=0;  aCar[i]!='\0'; i++)
    		if(aCar[i]>= 'A' && aCar[i]<='Z' || aCar[i]=='Ñ')
    			System.out.print((char)(aCar[i] + desp));
    		else 
    			System.out.print(aCar[i]);
    }
    
    public void arroba() {
    	
        for (int i = 0;  aCar[i]!='\0'; i++) {
            if (aCar[i] == 'a' || aCar[i] == 'A') {
                System.out.print('@');
            }
            else {
                System.out.print(aCar[i]);
            }
        }
    }
    
    public void espacioBlanco() {
   	 
        boolean espacioPermitido = false;
        for (int i = 0;  aCar[i]!='\0'; ++i) {
            if (aCar[i] == ' ') {
                if (espacioPermitido == true) {
                    System.out.print(aCar[i]);
                    espacioPermitido = false;
                }
            }
            else {
                System.out.print(aCar[i]);
                espacioPermitido = true;
            }
        }
    }
    
    public void sinNumeros() {
    	
        for (int i = 0; aCar[i] != '\0'; i++) {
        	if (aCar[i] < '0' || aCar[i] > '9') {
                System.out.print(aCar[i]);
            }
        }
    }
        
}
