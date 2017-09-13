package libs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Created by Pascal on 13.09.2017.
 */
public class Console {
	
	private static BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
	
	public Boolean readBoolean() {
		try {
			return Boolean.valueOf(inputReader.readLine());
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
			System.err.println("Fehler: Es wurde kein 'Boolean' Wert eingeben");
		}
		return false;
	}
	
	public String readString() {
		try {
			return inputReader.readLine();
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
			System.err.println("Fehler: Es wurde kein 'String' Wert eingeben");
		}
		return "";
	}
	
	public Byte readByte() {
		try {
			return Byte.valueOf(inputReader.readLine()).byteValue();
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
			System.err.println("Fehler: Es wurde kein 'Byte' Wert eingeben");
		}
		return (byte) 0;
	}
	
	public Short readShort() {
		try {
			return Short.valueOf(inputReader.readLine()).shortValue();
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
			System.err.println("Fehler: Es wurde kein 'Short' Wert eingeben");
		}
		
		return (short) 0;
	}
	
	public Integer readInteger() {
		try {
			return Integer.valueOf(inputReader.readLine()).intValue();
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
			System.err.println("Fehler: Es wurde kein 'Integer' Wert eingeben");
		}
		
		return 0;
	}
	
	public Integer readInt() {
		return readInteger();
	}
	
	public Long readLong() {
		try {
			return Long.valueOf(inputReader.readLine()).longValue();
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
			System.err.println("Fehler: Es wurde kein 'Long' Wert eingeben");
		}
		
		return 0L;
	}
	
	public Float readFloat() {
		try {
			return Float.valueOf(inputReader.readLine()).floatValue();
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
			System.err.println("Fehler: Es wurde kein 'Float' Wert eingeben");
		}
		
		return 0F;
	}
	
	public Double readDouble() {
		try {
			return Double.valueOf(inputReader.readLine()).doubleValue();
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
			System.err.println("Fehler: Es wurde kein 'Double' Wert eingeben");
		}
		
		return .0;
	}
	
	public char readChar() {
		try {
			char inputChar = (char) inputReader.read();
			inputReader.readLine();
			
			return inputChar;
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
			System.err.println("Fehler: Es wurde kein 'Char' Wert eingeben");
		}
		
		return ' ';
	}
}