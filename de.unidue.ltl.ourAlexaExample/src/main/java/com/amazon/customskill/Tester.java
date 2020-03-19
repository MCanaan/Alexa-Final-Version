package com.amazon.customskill;

//Umlaut replacements tester
public class Tester {
	
	private static String[][] UMLAUT_REPLACEMENTS = { { "�", "Ae" }, { "�", "Ue" }, { "�", "Oe" }, { "�", "ae" }, { "�", "ue" }, { "�", "oe" }, { "�", "ss" } };
	public static String replaceUmlaute(String orig) {
		    String result = orig;

		    for (int i = 0; i < UMLAUT_REPLACEMENTS.length; i++) {
		        result = result.replaceAll(UMLAUT_REPLACEMENTS[i][0], UMLAUT_REPLACEMENTS[i][1]);
		    }

		    return result;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "m�nze";
		System.out.println(replaceUmlaute(a));
	}

}
