
import java.util.*;
/**
 * Beschreiben Sie hier die Klasse RandomExample.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class RandomExample {
    
    public RandomExample() {
        List<String> nameList = Arrays.asList("Max", "Tim", "Fernando", "Ka xd"); // Größe = 4, java started bei 0 zu zählen = 3
        
        Random random = new Random();
        Integer index = random.nextInt(nameList.size()); // Randomzahl zwischen 0 und nameList.size() = 3
        
        String randomName = nameList.get(index);
        System.out.println(randomName);
    }
}