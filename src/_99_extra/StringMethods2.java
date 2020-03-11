package _99_extra;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


public class StringMethods2 {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it with
		//    random upper and lower case characters.
String upperLower = "QWERtYuioPASDFGhJklZxcVbNM";
		// 2. Print your String to the console in upper case.
		System.out.println(upperLower.charAt(0)); //q
		System.out.println(upperLower.charAt(1)); //w
		System.out.println(upperLower.charAt(2)); //e
		System.out.println(upperLower.charAt(3)); //r
		System.out.println(upperLower.charAt(5)); //y
		System.out.println(upperLower.charAt(9)); //p
		System.out.println(upperLower.charAt(10)); //a
		System.out.println(upperLower.charAt(11)); //s
		System.out.println(upperLower.charAt(12)); //d
		System.out.println(upperLower.charAt(13)); //f
		System.out.println(upperLower.charAt(14)); //g
		System.out.println(upperLower.charAt(16)); //j
		System.out.println(upperLower.charAt(19)); //z
		System.out.println(upperLower.charAt(22)); //V
		System.out.println(upperLower.charAt(24)); //n
		System.out.println(upperLower.charAt(25)); //m
		// 3. Print your String to the console in lower case.
		System.out.println(upperLower.charAt(4));
		System.out.println(upperLower.charAt(6));
		System.out.println(upperLower.charAt(7));
		System.out.println(upperLower.charAt(8));
		System.out.println(upperLower.charAt(15));
		System.out.println(upperLower.charAt(17));
		System.out.println(upperLower.charAt(18));
		System.out.println(upperLower.charAt(20));
		System.out.println(upperLower.charAt(21));
		System.out.println(upperLower.charAt(23));
		// 4. Print the first 3 char's of your String
		//    HINT: .substring(start,end)
		System.out.println(upperLower.substring(22,25));
		// 5. Print a single char somewhere in the middle of your String
		//    REMINDER: char's in string start at index 0
		
		// 6. BONUS -- print the LAST 3 char's of your string using
		//        .length() to determine WHERE the last 3 char's are located.
	}
}
