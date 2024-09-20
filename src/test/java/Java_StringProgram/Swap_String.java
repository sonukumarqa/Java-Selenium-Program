package Java_StringProgram;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Swap_String {
	
	@Test
	public void swapGivenSTring() {
		
		String s1= "TestFirst"; // 9
		String s2= "AutomateSecond"; //14
		
		s2= s1.concat(s2); // TestFirstAutomateSecond //23
		
		s1= s2.substring(s1.length());
		s2= s2.substring(0,(s2.length()- s1.length()));
		System.out.println(s1);
		System.out.print(s2);
		System.out.println();
		s1=s1.concat(s2);// AutomateSecond TestFirst
		
		s2=s1.substring(0, (s1.length()-s2.length())); //AutomateSecond
		s1= s1.substring(s2.length()); // TestFirst
		
		System.out.println("s1: "+ s1 +", "+" s2: "+s2);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of s1");
		s1= sc.nextLine();
		System.out.println("Enter the value of s2");
		s2= sc.next();
		System.out.println("before reverse ");
		System.out.println("s1: "+s1+ " and s2: "+s2);
		System.out.println("after reverse ");
		
    	String str= swapFunction(s1, s2);
    	System.out.println(str);
		
			
		
	}
	
	public String swapFunction(String s1, String s2)
	{
		
		
	    s1=	s1.concat(s2);
	    
	    s2= s1.substring(0, (s1.length()- s2.length()));
	    s1= s1.substring(s2.length());
	    
	    System.out.println("-----------");
		System.out.println("s1: "+s1+ " and s2: "+s2);
		 System.out.println("-----------");
		
		return s1+";"+ s2;
	}

}
