package collection2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo 
{
	
		
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> data =  new HashMap<>();
		
		data.put(2, "Java");
		data.put(1, "C++");
		data.put(3, "Python");
		data.put(5, "PHP");
		
		System.out.println(data);
		
		data.put(4, "JavaSript");
		
		data.put(4, "React");
		  

		System.out.println("==========================================");
		
		System.out.println(data);
		
	
//		System.out.println(	data.putIfAbsent(6, "nama"));
		
		System.out.println("==========================================");
		Set<Entry<Integer, String>> set =  data.entrySet();
		
		Iterator<Entry<Integer, String>> it = set.iterator();
		
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			
	//		Map.Entry entry = (Map.Entry).it.next();
			
			
		}
		

	}

	
	
	
	
}
