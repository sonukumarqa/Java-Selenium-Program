package Java_StringProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateWord {
	
	public static void main(String[] args) {
		
		
		
		String str="Hi Java Selenium java Selenium";
		
		String s[]= str.split(" ");
		
		List<String> list= new ArrayList<String>();
		
		Set<String> hashSet= new HashSet<String>();
		
		for(String s1: s) {
			
			list.add(s1);
			hashSet.add(s1);
		}
		
		for(String s3: hashSet)
		{
			int count=0;
			
			for(String s4 : list)
			{
				
				
				if(s3.equals(s4))
				{
					count++;
				}
				
				
			}
			
			if(count>1)
			{
				System.out.println(s3 + " : "+count);
			}
			
			
			
		}
		
		
		
	}
	

}
