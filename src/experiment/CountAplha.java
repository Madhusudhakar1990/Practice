package experiment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CountAplha 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		String name = "madhusudhakaryaragudi";
		
		char[] na = name.toCharArray();
		
		Map<Character,Integer>  m =  new HashMap<>();
		
		for(Character c : na)
		{
			if(m.containsKey(c))
			{
				m.put(c, m.get(c)+1);   // m.put(c,m.get(c)+1);
				
			}
			
			else
			{
				m.put(c, 1);
			}
			
		}
		
	//	System.out.println(m);
		
		Iterator<Entry<Character,Integer>>mn = m.entrySet().iterator();
		
		while(mn.hasNext())
		{
			System.out.println(mn.next());
			
			
		}
		
	}

}
