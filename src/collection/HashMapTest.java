package collection;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		HashMap<String, String>  couple =  new HashMap<String, String>();
		
		couple.put("Madhu", "Jalaja");
		couple.put("Karthik", "Reshma");
		couple.put("Sidhu", "Sushma");
		couple.put("chotu", null);
		couple.put(null, "Suma");
		couple.put("Nemo", null);
		
		
		
		System.out.println(couple);
		
//	System.out.println(couple.get("Madhu"));
		
//	System.out.println(couple.getOrDefault("Sidhu", "chotu"));
		
		System.out.println("***************");
		
		
	Iterator<String> it = couple.keySet().iterator();
	
	while(it.hasNext())
			{
				String cop = it.next();
				String cp =	couple.get(cop);
				System.out.println(cop+" == "+cp);
			}
		
	System.out.println("***************");	
	
	System.out.println(couple.containsKey("Karthik"));
	
	System.out.println(couple.containsValue("Jalaja"));
	
		
	
	
	
	}

}
