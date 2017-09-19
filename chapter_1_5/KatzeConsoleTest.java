package chapter_1_5;

import libs.Console;
/**
 * Write a description of class KatzeConsoleTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KatzeConsoleTest extends Console {
    
    /**
     * A console based test method for {@link chapter_1_5.Katze}
     */
    public KatzeConsoleTest() {
        String name, farbe, rasse;
        Integer alter;
        
        System.out.print("Name: ");
        name = readString();
        
        System.out.print("Farbe: ");
        farbe = readString();
        
        System.out.print("Rasse: ");
        rasse = readString();
        
        System.out.print("Alter: ");
        alter = readInteger();
        
        Katze katze = new Katze(name, farbe.toLowerCase(), rasse, alter);
        katze.sayName();
    }
}
