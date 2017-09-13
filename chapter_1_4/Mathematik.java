package chapter_1_4;

import libs.Console;
/**
 * Beschreiben Sie hier die Klasse Mathematik.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Mathematik extends Console {
    
   public void ganzZahlDividieren() {
        Integer inputA = 0, inputB = 0;
        
        System.out.print("Erste Zahl: ");
        inputA = readInteger();
        
        System.out.print("Zweite Zahl: ");
        inputB = readInteger();
        
        System.out.println("Ergebnis der Division: " + (inputA / inputB));
    }
    
    public void ganzZahlDividierenRest() {
        Integer inputA = 0, inputB = 0;
        
        System.out.print("Erste Zahl: ");
        inputA = readInteger();
        
        System.out.print("Zweite Zahl: ");
        inputB = readInteger();
        
        System.out.println("Rest der Division: " + (inputA % inputB));
    }
    
    public void multiplizieren() {
        Double inputA = .0, inputB = .0;
        
        System.out.print("Erste Zahl: ");
        inputA = readDouble();
        
        System.out.print("Zweite Zahl: ");
        inputB = readDouble();
        
        System.out.println("Ergebnis der Multiplikation: " + (inputA * inputB));
    }
    
    public void dividieren() {
        Double inputA = .0, inputB = .0;
        
        System.out.print("Erste Zahl: ");
        inputA = readDouble();
        
        System.out.print("Zweite Zahl: ");
        inputB = readDouble();
        
        System.out.println("Ergebnis der Division: " + (inputA / inputB));
    }
    
    public void quadrieren() {
        Double input = .0;
        
        System.out.print("Zu quadrierende Zahl: ");
        input = readDouble();
        
        System.out.println("Ergebnis der Quadrierung: " + (input * input));
    }

}