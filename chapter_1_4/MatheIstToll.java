package chapter_1_4;

import libs.Console;
/**
 * Beschreiben Sie hier die Klasse MatheIstToll.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class MatheIstToll {
    
    public MatheIstToll() {
        // aufgabeA();
        // aufgabeB();
        // aufgabeC();
        // aufgabeD();
        // aufgabeE();
    }
    
    private void aufgabeA() {
        System.out.println("Aufgabe 1: 2 / 6 * 3");
        
        Object object = (Integer) 2;
        
        System.out.println(object = (Integer) object / 6);
        System.out.println(object = (Integer) object * 3);
        
        System.out.println("Vergleich A: " + object + " == " + (2 / 6 * 3));
    }
    
    private void aufgabeB() {
        System.out.println("Aufgabe 2: 2 * 3 / 6");
        
        Object object = (Integer) 2;
        
        System.out.println(object = (Integer) object * 3);
        System.out.println(object = (Integer) object / 6);
        
        System.out.println("Vergleich B: " + object + " == " + (2 * 3 / 6));
    }
    
    private void aufgabeC() {
        System.out.println("Aufgabe 3: 2 / 6 * 3.0");
        
        Object object = (Integer) 2;
        
        System.out.println(object = (Integer) object / (Integer) 6);
        System.out.println(object = (Integer) object * (Double) 3.0);
        
        System.out.println("Vergleich C: " + object + " == " + (2 / 6 * 3.0));
    }
    
    private void aufgabeD() {
        System.out.println("Aufgabe 4: 2 / 6.0 * 3");
         
        Object object = (Integer) 2;
        
        System.out.println(object = (Integer) object / 6.);
        System.out.println(object = (Double) object * 3);
        
        System.out.println("Vergleich D: " + object + " == " + (2 / 6.0 * 3));
    }
    
    private void aufgabeE() {
        System.out.println("Aufgabe 5: 2 * 3 % 4 + 23");
        
        Object object = (Integer) 2;
        
        System.out.println(object = (Integer) object * 3);
        System.out.println(object = (Integer) object % 4);
        System.out.println(object = (Integer) object + 23);
        
        System.out.println("Vergleich E: " + object + " == " + (2 * 3 % 4 + 23));
    }
}