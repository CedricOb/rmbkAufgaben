package chapter_1_6;

import libs.Console;
/**
 * Beschreiben Sie hier die Klasse A7_Noten.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class A7_Noten extends Console {
    
    public void ermittleNote() {
        Integer punktzahl = 0;
        
        System.out.print("Punktzahl: ");
        punktzahl = readInteger();
        
        Note note;
        
        if(punktzahl >= 92) {
            note = Note.SEHR_GUT;
        } else if(punktzahl >= 81) {
            note = Note.GUT;
        } else if(punktzahl >= 67) {
            note = Note.BEFRIEDIGEND;
        } else if(punktzahl >= 50) {
            note = Note.AUSREICHEND;
        } else if(punktzahl >= 30) {
            note = Note.MANGELHAFT;
        } else {
            note = Note.UNGENUEGEND;
        }
        
        System.out.println("Erreichte Note: " + note);
    }
    
    private enum Note implements java.io.Serializable {
        SEHR_GUT("Sehr gut!", 1), GUT("Gut!", 2), BEFRIEDIGEND("Befriedigend", 3),
        AUSREICHEND("Ausreichend.", 4), MANGELHAFT("Mangelhaft...", 5), UNGENUEGEND("Ungenügend", 6);
        
        private Note(String ausgeschrieben, Integer entsprechendeZahl) {
            this.ausgeschrieben = ausgeschrieben;
            this.entsprechendeZahl = entsprechendeZahl;
        }
        
        private String ausgeschrieben;
        private Integer entsprechendeZahl;
        
        @Override
        public String toString() {
            return ausgeschrieben + String.format("(%s)", entsprechendeZahl);
        }
    }
}