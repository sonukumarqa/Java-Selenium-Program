package JavaProgramm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_DuplicateCharacterAndRemoveIt {
	
	public static void main(String[] args) {
		
		String s="AutomationwithJavaSelenium";
		int duplicateCount=0;
		
		List<String> aList= new ArrayList<String>();	
		Set<String> hSet= new HashSet<String>();
		
        for(char ch : s.toCharArray()) {
        	aList.add(Character.toString(ch));
			hSet.add(Character.toString(ch));
		}
		
        
		System.out.println("listString : " + aList);
		System.out.println("setString : "+ hSet);
		
	
		for(String sSet : hSet)
		{
			int count=0;
			
			for(int i=0; i<aList.size(); i++) 
			{
				
				if(sSet.contains(aList.get(i)))
				{
					count++;
				}					
			}
			
			if(count>1)
			{
				System.out.println(sSet+" : "+ count);
			}
			
			
		}
		
	
		
		
		
		
	}

}
