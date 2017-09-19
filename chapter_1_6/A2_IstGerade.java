package chapter_1_6;

import libs.Console;
/**
 * Beschreiben Sie hier die Klasse A2_IstGerade.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class A2_IstGerade extends Console {
    
    public A2_IstGerade() {
        Double doub;
        
        System.out.print("Geben sie eine Zahl ein: ");
        doub = readDouble();
        System.out.println("Input: " + doub);
        
        System.out.println(istGerade(doub));
    }
    
    public Boolean istGerade(Double input) {
        return ((input % 2) == 0);
    }
}