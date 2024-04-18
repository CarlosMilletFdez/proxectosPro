package misClases.avaliacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CArrayCaracteres_bis {
    private char[] caracteres = new char[50];

    public void recoge() {
        System.out.println("Introduce una cadena de caracteres:");
        try {
        	InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);
            flujoE.read(caracteres, 0, caracteres.length);
        } catch (IOException e) {
            System.err.println("Código de error");
        }
    }

    public void amosa() {
    	
        for (int i = 0; caracteres[i] != '\0'; ++i) {
            System.out.print(caracteres[i]);
        }
    }

    public void maiusculas() {
    	 
    	 for (int i = 0; caracteres[i] != '\0'; ++i) {
             if (caracteres[i] >= 'a' && caracteres[i] <= 'z') {
                 System.out.print((char)(caracteres[i] - ' '));
             }
             else if (caracteres[i] == '\u00f1') {
                 System.out.print('\u00d1');
             }
             else {
                 System.out.print(caracteres[i]);
             }
         }
    	 
     }
    
    public void minusculas() {
         
         for (int i = 0; caracteres[i] != '\0'; ++i) {
             if (caracteres[i] >= 'A' && caracteres[i] <= 'Z') {
                 System.out.print((char)(caracteres[i] + ' '));
             }
             else if (caracteres[i] == '\u00d1') {
                 System.out.print('\u00f1');
             }
             else {
                 System.out.print(caracteres[i]);
             }
         }
     }
    

    
    public void arroba() {
    	
        for (int i = 0; caracteres[i] != '\0'; ++i) {
            if (caracteres[i] == 'a' || caracteres[i] == 'A') {
                System.out.print('@');
            }
            else {
                System.out.print(caracteres[i]);
            }
        }
    }

    public void espacioBlanco() {
    	 
         boolean espacios = false;
         for (int i = 0; caracteres[i] != '\0'; ++i) {
             if (caracteres[i] == ' ') {
                 if (espacios) {
                     System.out.print(caracteres[i]);
                     espacios = false;
                 }
             }
             else {
                 System.out.print(caracteres[i]);
                 espacios = true;
             }
         }
     }
     
    public void sinNumeros() {
    	
        for (int i = 0; caracteres[i] != '\0'; ++i) {
            if (caracteres[i] < '0' || caracteres[i] > '9') {
                System.out.print(caracteres[i]);
            }
        }
    }
  
}
