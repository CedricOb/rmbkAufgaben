package chapter_1_5;

/**
 * Not ready yet.
 * 
 * @author cloned from webpage.
 */
public class MatheTest {
    
    int x=2, y=4, z=6;
    
    void firstMethode()
    {
        int z=8;
        z= x +y +z; // 2 + 4 + 8 = 14
        
        x= y/2+z; // 4 / 2 + 14 = 16
        y= x/z; // 16 / 14 = 1
        
        secondMethode();
        thirdMethode();
    }    
    void secondMethode()
    {
        int x=12,y=13;
        
        /**
         * Input:
         * x = 12 -> 26
         * y = 13 
         * z = 14 -> 53
         */
        
        x=x+z; // 12 + 14 = 26
        z=x+y+z; // 26 + 13 + 14 = 53
        y=3+z; // 3 + 53 = 56
    }    
    void thirdMethode()
    {
         System.out.println("x= " + x + "\ty= " + y + "\tz= " + z);
    }
}