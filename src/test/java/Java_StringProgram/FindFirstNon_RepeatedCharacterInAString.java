package Java_StringProgram;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNon_RepeatedCharacterInAString {

	
	public static void main(String[] args) {
		
		
		String str="Automation";
		String s="Automation";
		
		Map<Character, Integer>  charCount= new LinkedHashMap<Character, Integer>();
		for(char c : str.toCharArray())
		{
			charCount.put(c, charCount.getOrDefault(c, 0)+1);
			
		}
		
		for(Map.Entry<Character, Integer> entry : charCount.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey());
				break;
			}
		}
		
	}
	
}
