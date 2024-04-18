package misClases.avaliacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CString {

private String cadena;
    

    public void recolle() {
    	
        try {
        	InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);
            System.out.println("Introduce unha cadea:");
            cadena = flujoE.readLine();
            
        } catch (IOException e) {
        	System.err.println("Error");
        }
    }

    public void amosa() {
    	
        System.out.println(cadena);
    }
    
    public void maiusculas() {
    	
        System.out.println(cadena.toUpperCase());
    }
    
    public void minusculas() {
    	
        System.out.println(cadena.toLowerCase());
    }
    
    public void arroba() {
    	
        StringBuffer stringB = new StringBuffer(cadena);
        
        for (int i = 0; i < stringB.length(); ++i) {
            if (stringB.charAt(i) == 'a' || stringB.charAt(i) == 'A') {
                stringB.setCharAt(i, '@');
            }
        }
        
        System.out.println(stringB.toString());
    }
    
    public void espacioBlanco() {
    	
        StringBuffer stringB = new StringBuffer(cadena);
        boolean borradoPermitido = true;
        int i = 0;
        
        while (i < stringB.length()) {
            if (stringB.charAt(i) == ' ') {
                if (borradoPermitido) {
                    stringB.deleteCharAt(i);
                }
                else {
                	borradoPermitido = true;
                    ++i;
                }
            }
            else {
            	borradoPermitido = false;
                ++i;
            }
        }
        System.out.println(stringB.toString());
    }
    
    public void sinNumeros() {
    	
        StringBuffer stringB = new StringBuffer(cadena);
        int i = 0;
        while (i < stringB.length()) {
            if (stringB.charAt(i) >= '0' && stringB.charAt(i) <= '9') {
                stringB.deleteCharAt(i);
            }
            else {
                ++i;
            }
        }
        System.out.println(stringB.toString());
    }
}
