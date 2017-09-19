package chapter_1_4;


/**
 * Beschreiben Sie hier die Klasse ZuGrosserWert.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class A4_ZuGrosserWert {
    
    public A4_ZuGrosserWert() {
        System.out.println("Minimaler Wert - 1 ergibt: " + (Integer.MIN_VALUE - 1)); // fängt wieder MAX_VALUE an. = 2147483647
        System.out.println("Maximaler Wert + 1 ergibt: " + (Integer.MAX_VALUE + 1)); // beginnt wieder bei MIN_VALUE. = -2147483648
    }
}