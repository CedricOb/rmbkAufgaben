package chapter_1_6;

import libs.Console;
/**
 * Beschreiben Sie hier die Klasse A3_Versandhaus.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class A3_4_Versandhaus extends Console {
    
    private final double VERSANDKOSTEN = 5.00;
    
    public A3_4_Versandhaus() {
        ermittleGesamtbetrag();
    }
    
    public void ermittleGesamtbetrag() {
        double rechnungsPreis = .0;
        
        System.out.print("Rechnungspreis: ");
        rechnungsPreis = readDouble();
        
        double gesamtPreis = rechnungsPreis;
        
        if(rechnungsPreis <= 20) {
            gesamtPreis = rechnungsPreis + VERSANDKOSTEN;
        }
        
        System.out.println("Gesamtpreis mit VK: " + gesamtPreis);
    }
    
    public void ermittleProvision() {
        double umsatz = .0;
        
        System.out.print("Umsatz des Mitarbeiters: ");
        umsatz = readDouble();
        
        double provision = .0;
        
        if(umsatz > 100000) {
            provision = umsatz * 0.2 / 100;
        }
        
        System.out.println("Provision: " + provision);
        System.out.println("Gesamtverdienst: " + (umsatz + provision));
    }
}
