package chapter_1_5;

/**
 * Write a description of class Katze here.
 * 
 * @author PascalKu
 * @version 19.09.2017
 */
public class Katze implements java.io.Serializable {
    
    /**
     * Variables.
     */
    private String name = null, farbe = null, rasse = null;
    private Integer alter = 0;
    
    /**
     * Inital method without parameters.
     */
    public Katze() {}
    
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
     * update the 'name' of the cat
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * update the 'skin color' of the cat
     */
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    
    /**
     * update the 'rasse' of the cat
     */
    public void setRasse(String rasse) {
        this.rasse = rasse;
    }
    
    /**
     * update the 'alter' of the cat
     */
    public void setAlter(Integer alter) {
        this.alter = alter;
    }
    
    /**
     * outprint the 'name' of the cat
     */
    public void sayName() {
        String outputString = String.format("Hey, ich heiße %s!", name);
        System.out.println(outputString);
    }
    
    /**
     * outprint the 'skin color' of the cat
     */
    public void sayFarbe() {
        String outputString = String.format("Ich bin eine %s Katze.", farbe);
        System.out.println(outputString);
    }
    
    /**
     * outprint the 'rasse' of the cat
     */
    public void sayRasse() {
        String outputString = String.format("Meine Rasse ist: %s...", rasse);
        System.out.println(outputString);
    }
    
    /**
     * outprint the 'alter' of the cat
     */
    public void sayAlter() {
        String outputString = String.format("Ich bin %s %s jung.", alter, (alter == 1 ? "Jahr" : "Jahre"));
        System.out.println(outputString);
    }
    
    /**
     * print all data of the cat
     */
    @Override
    public String toString() {
        String string = String.format("Hey, ich heiße %s und bin eine %s Katze. Ich bin %s und %s Jahre jung.", name, farbe, rasse, alter);
        return string;
    }
}
