package chapter_1_4;

import libs.Console;
/**
 * Beschreiben Sie hier die Klasse Waehrungsrechner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Waerungsrechner extends Console {
    
    private final Integer KURS = 1.4373;
    
    public void euroToDollar() {
        Double input = .0;
        
        System.out.print("Umzurechnende Euro: ");
        input = readDouble();
        
        Double output = input * KURS;
        System.out.println("Betrag in USD: " + output);
    }
    
    public void dollarToEuro() {
        Double input = .0;
        
        System.out.print("Umzurechnende Dollar: ");
        input = readDouble();
        
        Double output = input / KURS;
        System.out.println("Betrag in Euro: " + output);
    }
}
