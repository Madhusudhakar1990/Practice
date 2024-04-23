package collection2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapKeHashDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		
		Map<Integer,String> data =  new HashMap<>();
		
		data.put(2, "Java");
		data.put(1, "C++");
		data.put(3, "Python");
		data.put(5, "PHP");
		data.put(4, "JavaSript");
		
		
		System.out.println(data.values());
		
		System.out.println(data.keySet());
		
		int len = data.size();
		
		System.out.println(len);
		
		System.out.println(data.get(len-1));
		
			
		
		
		
		
		
		
		
	}

}
