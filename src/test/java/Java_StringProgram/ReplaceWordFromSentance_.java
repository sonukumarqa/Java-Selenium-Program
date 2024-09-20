package Java_StringProgram;

import java.util.ArrayList;
import java.util.List;

public class ReplaceWordFromSentance_ {
	
	public static void main(String[] args) {
		
		
		String s= "Step by Step, bit by bit, we made progress";// step--> Stage/Phase, bit-->Piece/Part/Slice
		String [] word= s.split(" ");
		
		System.out.println("Before replacing word : "+s);
		
		List<String> aList= new ArrayList<String>();
		
		for(String s1 : word)
		{
			if(s1.contains("Step"))
			{
			aList.add(s1.replaceAll("Step" , "Stage"));
			}
			else
			{
				aList.add(s1);
			}
		}
		
		
		System.out.println("After replacing word : "+ aList);
		
		
	}

}
