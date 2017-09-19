package chapter_1_5;

import chapter_1_5.Katze;
/**
 * Write a description of class KatzeTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KatzeTest {
    
    /**
     * A method for {@link chapter_1_5.Katze}
     */
    public KatzeTest() {
        Katze katze = new Katze("Max", "rot", "American Curl", 2);
        katze.sayName();
    }
}
