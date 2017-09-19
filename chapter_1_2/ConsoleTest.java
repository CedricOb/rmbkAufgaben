package console_basics;

import libs.Console;
/**
 * Beschreiben Sie hier die Klasse ConsoleTest.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ConsoleTest extends Console {
   
    public ConsoleTest() {
        Person person = new Person();
        
        System.out.print("Name: ");
        person.setName(readString());
        
        System.out.print("Alter: ");
        person.setAge((byte) readByte());
        
        System.out.println(person);
    }
    
    private class Person implements java.io.Serializable {
        
        private String name;
        private Byte age;
        
        public void setName(String name) {
            this.name = name;
        }
        
        public void setAge(Byte age) {
            this.age = age;
        }
        
        @Override
        public String toString() {
            return String.format("Du heißt %s und bist %s " + (age == 1 ? "Jahr" : "Jahre") + " alt!", name, age);
        }
    }
}