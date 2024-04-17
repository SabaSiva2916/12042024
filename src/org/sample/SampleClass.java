package org.sample;

import java.util.LinkedHashMap;
import java.util.Map;

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

	// occurance
	String st = "java programm";
	Map<Character, Integer> n = new LinkedHashMap<>();
	for (int i = 0; i < st.length(); i++) {
	    char c = str.charAt(i);
	    if (n.containsValue(n.get(c))) {
		Integer integer = n.get(c);
		n.put(c, integer + 1);
	    } else {
		n.put(c, 1);
	    }

	}

	System.out.println(n);

    }
}
