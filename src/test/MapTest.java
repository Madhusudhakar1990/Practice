package test;

import java.util.HashMap;
import java.util.Map;

public class MapTest 
{

	public static void main(String[] args) 
	{

		String name = "Madhusudhakaryaragudi";
		
		char[] alpha = name.toCharArray();
		
		Map<Character,Integer> m = new HashMap<>();
		
		for(Character  c: alpha)
		{
			if(m.containsKey(c))
			{
				m.put(c, m.get(c)+1);
			}
			else
			{
				m.put(c, 1);
				
			}
		}
		
		System.out.println(m);
		
		
		

	}

}
