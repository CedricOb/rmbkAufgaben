package chapter_1_4;

import libs.Console;
/**
 * Write a description of class Relationen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Relationen extends Console {
    
    // Liest zwei ganze Zahlen von der Konsole und gibt das Ergebnis des Vergleiches (>) aus.
    public void istGroesser() {
        Integer zahlA, zahlB;
        
        System.out.print("Erste ganze Zahl: ");
        zahlA = readInteger();
        
        System.out.print("Zweite ganze Zahl: ");
        zahlB = readInteger();
        
        System.out.println(">? " + (zahlA > zahlB));
    }
    
    // Liest zwei ganze Zahlen von der Konsole und gibt das Ergebnis des Vergleiches (<) aus.
    public void istKleiner() {
        Integer zahlA, zahlB;
        
        System.out.print("Erste ganze Zahl: ");
        zahlA = readInteger();
        
        System.out.print("Zweite ganze Zahl: ");
        zahlB = readInteger();
        
        System.out.println("<? " + (zahlA < zahlB));
    }
    
    // Liest zwei ganze Zahlen von der Konsole und gibt das Ergebnis des Vergleiches (>=) aus.
    public void istGroesserGleich() {
        Integer zahlA, zahlB;
        
        System.out.print("Erste ganze Zahl: ");
        zahlA = readInteger();
        
        System.out.print("Zweite ganze Zahl: ");
        zahlB = readInteger();
        
        System.out.println(">=? " + (zahlA >= zahlB));
    }
    
    // Liest zwei ganze Zahlen von der Konsole und gibt das Ergebnis des Vergleiches (==) aus.
    public void istGleich() {
        Integer zahlA, zahlB;
        
        System.out.print("Erste ganze Zahl: ");
        zahlA = readInteger();
        
        System.out.print("Zweite ganze Zahl: ");
        zahlB = readInteger();
        
        System.out.println("==? " + (zahlA == zahlB));
    }
    
    // Liest zwei ganze Zahlen von der Konsole und gibt das Ergebnis des Vergleiches (!=) aus.
    public void istUngleich() {
        Integer zahlA, zahlB;
        
        System.out.print("Erste ganze Zahl: ");
        zahlA = readInteger();
        
        System.out.print("Zweite ganze Zahl: ");
        zahlB = readInteger();
        
        System.out.println("!=? " + (zahlA != zahlB));
    }
}
