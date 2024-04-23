package collection2;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemoTwo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Map<Integer, String> data =  new HashMap<>();
		
		data.put(1, "Samsung");
		data.put(2, "Google");
		data.put(3, "Iphone");
		data.put(4,null);
		
		
		for(Map.Entry m : data.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
			
//			System.out.println(m.getValue());
		}
		
		
		
	}

}
