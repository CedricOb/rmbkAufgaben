package chapter_1_5;

import libs.Console;
/**
 * Test Class with Console for {@link chapter_1_5.Katze}
 * 
 * @author PascalKu
 * @version 25.09.2017
 */
public class KatzeConsoleTest extends Console {
    
    /**
     * A console based test method for {@link chapter_1_5.Katze}
     */
    public KatzeConsoleTest() {
        Katze katze = new Katze();
        
        System.out.print("Name: ");
        katze.setName(readString());
        
        System.out.print("Farbe: ");
        katze.setFarbe(readString());
        
        System.out.print("Rasse: ");
        katze.setRasse(readString());
        
        System.out.print("Alter: ");
        katze.setAlter(readInteger());
        
        System.out.println(katze);
    }
}
