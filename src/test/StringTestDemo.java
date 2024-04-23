package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringTestDemo 
{

	public static void main(String[] args) 
	{

		String name  = "Madhusudhakaryarafydu";
		
		String d = " ";
		
		
		char[] word = name.toCharArray();
		
		Set<Character> s = new HashSet<>();
		
		
		for(Character c : word)
		{
			s.add(c);
//			d = d+c;
			
		}
		
		System.out.println(s);
//		System.out.println(d);
		
		Iterator<Character> it = s.iterator();
		
		while(it.hasNext())
		{
			d = d + it.next();
			
		}
		
		System.out.println(d);
	}

}
