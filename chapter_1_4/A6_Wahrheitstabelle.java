package chapter_1_4;

/**
 * Write a description of class Wahrheitstabelle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A6_7_Wahrheitstabelle {
    
    public A6_7_Wahrheitstabelle() {
        System.out.println("Und (&&):");
        System.out.println("00 -> " + (false && false));
        System.out.println("01 -> " + (false && true));
        System.out.println("10 -> " + (true && false));
        System.out.println("11 -> " + (true && true));
        
        System.out.println("Oder (||):");
        System.out.println("00 -> " + (false || false));
        System.out.println("01 -> " + (false || true));
        System.out.println("10 -> " + (true || false));
        System.out.println("11 -> " + (true || true));
        
        System.out.println("XOR [Exclusive OR](^):");
        System.out.println("00 -> " + (false ^ false));
        System.out.println("01 -> " + (false ^ true));
        System.out.println("10 -> " + (true ^ false));
        System.out.println("11 -> " + (true ^ true));
    }
}
