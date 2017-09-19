package chapter_1_4;

/**
 * Write a description of class Wahrheitstabelle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wahrheitstabelle {
    
    public Wahrheitstabelle() {
        System.out.println("00 -> " + (false && false));
        System.out.println("01 -> " + (false && true));
        System.out.println("10 -> " + (true && false));
        System.out.println("11 -> " + (true && true));
    }
}
