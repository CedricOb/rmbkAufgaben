package chapter_1_5;

/**
 * Write a description of class Katze here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Katze {
    
    private String name = null, farbe = null, rasse = null;
    private Integer alter = 0;
    
    /**
     * Inital method to set all variables of the cat
     */
    public Katze(String name, String farbe, String rasse, Integer alter) {
        this.name = name;
        this.farbe = farbe + "e";
        this.rasse = rasse;
        
        this.alter = alter;
    }
    
    /**
     * change the name of the cat
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * update the skin color of the cat
     */
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    
    /**
     * print all data of the cat
     */
    public void sayName() {
        String string = String.format("Hey, ich heiße %s und bin eine %s Katze. Ich bin %s und %s Jahre jung.", name, farbe, rasse, alter);
        System.out.println(string);
    }
}
