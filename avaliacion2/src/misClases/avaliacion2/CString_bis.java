package misClases.avaliacion2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class CString_bis {
    private String str;
    

    public void recoge() {
        try {
        	InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);
            System.out.println("Introduce unha cadea:");
            str = flujoE.readLine();
            
        } catch (IOException e) {
        	System.err.println("Código de error");
        }
    }

    public void amosa() {
        System.out.println(str);
    }
    
    public void maiusculas() {
        System.out.println(str.toUpperCase());
    }
    
    public void minusculas() {
        System.out.println(str.toLowerCase());
    }
    
    public void arroba() {
        StringBuffer stringB = new StringBuffer(str);
        for (int i = 0; i < stringB.length(); ++i) {
            if (stringB.charAt(i) == 'a' || stringB.charAt(i) == 'A') {
                stringB.setCharAt(i, '@');
            }
        }
        System.out.println(stringB.toString());
    }
    
    public void espacioBlanco() {
        StringBuffer stringB = new StringBuffer(str);
        boolean borrar = true;
        int i = 0;
        while (i < stringB.length()) {
            if (stringB.charAt(i) == ' ') {
                if (borrar) {
                    stringB.deleteCharAt(i);
                }
                else {
                    borrar = true;
                    ++i;
                }
            }
            else {
                borrar = false;
                ++i;
            }
        }
        System.out.println(stringB.toString());
    }
    
    public void sinNumeros() {
        StringBuffer stringB = new StringBuffer(str);
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