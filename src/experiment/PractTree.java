package experiment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PractTree 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the name ");
		String name  = sc.next();
		sc.close();
		
	//System.out.println("entered name : "+name);
		
		System.out.println(name.length());
		
		Map<Character,Integer> m = new HashMap<>();
		
		
		char[] naam = name.toCharArray();
		
//		System.out.println(naam.length);
//		
//		for(int i =0;i <=naam.length-1;i++)
//		{
//		System.out.println(	naam[i]);
//			
//		}
		
		
		for(Character  c : naam)
		{
			if (m.containsKey(c))
			{
				m.put(c, m.get(c)+1);
			}
			
			else
				
			{
				m.put(c, 1);
			}
		}
		System.out.println("*****************");
		
		System.out.println(m);
		
		Iterator<Entry<Character,Integer>> nm = m.entrySet().iterator();
		
		System.out.println("*****************");
		
	while(nm.hasNext())
	{
		System.out.println(nm.next());
		
	}
		
		
	}

}
