package chapter_1_6;

import libs.Console;
/**
 * Beschreiben Sie hier die Klasse A1_ZahlenVergleich.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class A1_ZahlenVergleich extends Console {
    
    public A1_ZahlenVergleich() {
        Integer inputA, inputB;
        
        System.out.print("Erste Zahl: ");
        inputA = readInteger();
        
        System.out.print("Zweite Zahl: ");
        inputB = readInteger();
        
        System.out.println("Größeste Zahl: " + biggerInteger(inputA, inputB));
    }
    
    private Integer biggerInteger(Integer inputA, Integer inputB) {
        return (inputA > inputB ? inputA : inputB);
    }
}