package Java_StringProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReverseString {
	
	@Test
	public void reverseString() {
		
		
		
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://google.com");
		
		String s="Java Programming Language";
		String s1="";
		
		char c[]= s.toCharArray();
		
		for (int i = c.length-1; i >=0; i--) {
	
			s1=s1+c[i];			
		}
		
		System.out.println(s1);
		
		
	}
	

}
