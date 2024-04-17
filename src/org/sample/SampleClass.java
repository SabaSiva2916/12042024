package org.sample;

public class SampleClass {

    public static void main(String[] args) {
	System.out.println("Hello World!!!");
	// Reverse of String
	String str = "java programm";
	String output = "";
	for (int i = str.length() - 1; i >= 0; i--) {
	    char c = str.charAt(i);
	    output = output + c;
	}
	System.out.println("Reverse of String :" + output);
    }
}
