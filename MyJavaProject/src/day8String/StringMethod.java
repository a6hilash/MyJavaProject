package day8String;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {

		String a = "abhi";

		//	String s1 = new String("abhilash")
		System.out.println(a);

		int l = a.length();

		System.out.println(l);

		String p = "selenium";
		
		
		System.out.println(p.charAt(3)); //to see the index of the particular character
		
		
		String q = " hill";
		String w = "      welcome to my to crib";
		String e = "homealone";
		
		
//		System.out.println(q.equals(w));
		
//		System.out.println(q.equalsIgnoreCase(w));
		
		
//		System.out.println(w + e);
		
//		System.out.println(w.concat(e));
		
//		System.out.println("go".concat(w).concat(q));
		
		
//		System.out.println(w.indexOf("to"));
		
//		System.out.println(w.lastIndexOf("to"));
		
		
//		System.out.println(e.contains("ho"));
		
//		System.out.println(e.substring(0,4));
		
//		System.out.println(w.toLowerCase());
		
//		System.out.println(w.toUpperCase());
		
		
		
//		System.out.println(w.trim());
		
//		String m="java | program | study";
//		System.out.println(m.replace('|', ','));
//		
//		System.out.println(m.replace("java", "python"));
		
		
		
		String mail ="abhi@gmail.com";
		
		String emailSplit[]=mail.split("@");
		
		System.out.println(emailSplit[0]);
		System.out.println(emailSplit[1]);
		
		String fruits = "apple_banana_pinapple";
		String[] fruitsplit = fruits.split("_");
		System.out.println(Arrays.toString(fruitsplit));
		
		
		String date[]= {"20","jan","2024"};
		String dateFormat = String.join("/", date);
		System.out.println(dateFormat);		
		
		}
		
		
		
	}

