package chapter_1_5;


/**
 * Welche Werte werden nach Aufruf der Methode firstMethode() ausgegeben?
 * 
 * @author PascalKu
 * @version 25.09.2017
 */
public class A2_DokumentiertRechnen {
    int x=2, y=4, z=6;
    //    16   1   37
    
    void firstMethode() {
        int z=8; // 14
        z= x +y +z; // -> local
        // 2 + 4 + 8 = 14
        x= y/2+z;
        //! 4 / 2 + 14 = 16 !!
        y= x/z;
        // 16 / 14 = 1
        secondMethode();
        thirdMethode();
    }
    
    void secondMethode() {
        int x=12,y=13; // 18
        x=x+z;
        // 12 + 6 = 18 -> local
        z=x+y+z;
        // 18 + 13 + 6 = 37 !!
        y=3+z;
        // 3 + 37 = 40 -> local
    }
    
    void thirdMethode() {
        System.out.println("x= "+x+"\ty= "+y+"\tz= "+z);
        // Output: x= 16	y= 1	z= 37
    }    
}
