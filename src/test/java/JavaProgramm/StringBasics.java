package JavaProgramm;

public class StringBasics {
	
	public static void main(String[] args) {
		
		String str="SonuAutomation";
		
		// 1. Length of String
		System.out.println(str.length());
		
		//2 check STring Empty
		System.out.println(str.isEmpty());	
		String s1="";
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		
		
		// 3. count occurrence of 'a' char in string
		String s2="Automation";
		
		char ch='a';
		int count=0;
		
		for(char c : s2.toCharArray())
		{
			if(c==ch)
			{
				count++;
			}
		}
		System.out.println("count of a : "+count);
		
		
		// 4. check if string contains another string
		s1="Automation Testing";
		s2="Testing";
	//	System.out.println();
		System.out.println(s1.contains(s2));
		
		// 5. remove all whitespace from String
		
		str= "A u t o m a t i o   n";
		
		str= str.replaceAll("\\s", "");
		System.out.println(str);
		
		
		
		
		
	}

}
