package Java_StringProgram;

import java.util.Iterator;

import org.testng.annotations.Test;

public class CountUpperCaseAndLowerCase {

	
	@Test
	public void CaseSensetiveCount() {
		
		String s1= "HelloDingaIamSawn";
		int count=0;
		int lCount = 0,uCount = 0;
		char ch[]= s1.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if(Character.isUpperCase(ch[i]))
			{
				count++;
			}
			
		}
		
		System.out.println("UpperCase count: "+ count);
		System.out.println("LowerCase count: "+ (ch.length-count));
		
		for (char c : ch) {
			
			if(c>='A' && c<='Z')
			{
				uCount++;
			}
			else
			{
				lCount++;
			}
			
		}
		
		System.out.println("UpperCase count: "+ uCount);
		System.out.println("LowerCase count: "+ lCount);
	}
	
}
