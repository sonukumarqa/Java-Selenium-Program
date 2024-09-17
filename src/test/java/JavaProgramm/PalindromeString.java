package JavaProgramm;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String s= "racecar";
		String rev="";
		
		for(int i=0; i<s.length(); i++) {
			
			rev= s.charAt(i) + rev;
		}
		
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("Given string is palindrome : "+rev);
		}
		else {
			
			System.out.println("given string is non-palindrome : "+rev);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word for which to check palindrome string");
		
				
		String str= sc.next();
		String str1="";
		
		char ch[]= str.toCharArray();
		
		for (char c : ch) {
			
			str1= c+ str1; 
			
			
		}
		
				
		if(str.equalsIgnoreCase(str1)) {
			
			System.out.println("Entered String is Palindrome : "+str1);
		}
		else {
			System.out.println("entered string is not a palindrome : "+ str);
		}
		
	}

}
