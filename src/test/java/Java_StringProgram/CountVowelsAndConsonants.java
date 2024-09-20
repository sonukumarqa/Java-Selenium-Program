package Java_StringProgram;

public class CountVowelsAndConsonants {
	
	public static void main(String[] args) {
		
		String s= "TestAutomation";
		
		int vowels=0, consonants=0;
		
		for (char c : s.toCharArray()) {
			
			if("aeiouAEIOU".indexOf(c)!=-1) {
				
				consonants++;			
			}
			else {
				vowels++;
			}
			
		}		
		System.out.println("vowels count : "+ vowels + " , "+"consonent count : "+ consonants);	
	}

}
