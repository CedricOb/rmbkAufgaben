package chapter_1_6;

import libs.Console;
/**
 * Beschreiben Sie hier die Klasse A4_Geschlecht.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class A5_Geschlecht extends Console{
    
    public A5_Geschlecht() {
        System.out.print("Bist du m/f ?");
        
        Geschlecht geschlecht = null;
        
        String string = readString();
        
        switch(string.toLowerCase()) {
            case "m":
                geschlecht = Geschlecht.MALE;
                break;
            case "w": case "f":
                geschlecht = Geschlecht.FEMALE;
                break;
            default:
                System.out.println("Wrong input!");
                return;
        }
        
        System.out.println("Geschlecht: " + geschlecht.getCount() + " -> " + geschlecht);
    }
    
    public enum Geschlecht {
        FEMALE(0), MALE(1);
        
        private Geschlecht(Integer count) {
            this.count = count;
        }
        
        private Integer count;
        
        public Integer getCount() {
            return count;
        }
    }
}