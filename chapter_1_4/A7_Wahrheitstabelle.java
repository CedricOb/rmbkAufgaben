package chapter_1_4;

/**
 * Write a description of class A7_Wahrheitstabelle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A7_Wahrheitstabelle {
    
    public A7_Wahrheitstabelle() {
        // Gleichung: c= (a||b) ^ (b&&c); 
        System.out.println("Gleichung: c = (a || b) ^ (b && c)");
        System.out.println();
        
        System.out.println("\ta\t|\tb\t|\tc\t|\ta||b\t|\tb&&c\t|\t(a||b)^(b&&c)");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        
        boolean[] bools = new boolean[2];
        bools[0] = true;
        bools[1] = false;
        
        for(boolean a : bools) {
            for(boolean b : bools) {
                for(boolean c : bools) {
                    System.out.println("\t" + a + "\t|\t" + b + "\t|\t" + c + "\t|\t" + (a || b) + "\t|\t" + (b && c) + "\t|\t" + ((a || b) ^ (b && c)));
                }
            }
        }
    }
}
