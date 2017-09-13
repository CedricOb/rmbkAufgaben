import libs.Console;

public class Niklass extends Console {
    
    public Niklass() {
        // Inhalt
        System.out.print("Zufälliger Integer: ");
        Integer objectName = 0;
        
        objectName = readInteger();
        
        System.out.println("Integer: " + objectName);
    }
}