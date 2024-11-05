package com.day4;

public class String1 {

	public static void main(String[] args) {
		String s1 = "Chandra";
		String s2 = new String("chandra");
		char ch[] = {'c', 'h'};
		String s3 = new String(ch);
		
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1.charAt(1));//h
		
		System.out.println(s1.indexOf("a")); //2
		System.out.println(s1.lastIndexOf("a")); //6
		
		System.out.println(s2.toUpperCase()); //CHANDRA
		System.out.println(s1.toLowerCase()); //chandra
		
		System.out.println(s1.startsWith("Cha")); //true
		System.out.println(s2.endsWith("ra")); //true
		
		System.out.println(s1.replace("a", "r")); //Chrndrr
		
		String s4 = "Java World";
		System.out.println(s4.substring(2, 7)); //va Wo
		System.out.println(s4.substring(5)); //World
//		System.out.println(s4.trim());
		
		String temp[] = s4.split(" ");
		for(String s : temp) {
			System.out.println(s);
		}
		
		char t[] = s4.toCharArray();
		for(char c : t) {
			System.out.println(c);
		}
		
		int a = 17;
		System.out.println(String.valueOf(a));
		
	}

}
