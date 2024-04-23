package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Collec 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		CopyOnWriteArrayList<String>  list = new CopyOnWriteArrayList<String>();
		
		list.add("Madhu");
		list.add("Madhav");
		list.add("Mahadev");
		
		Iterator<String> it  = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		ConcurrentHashMap<String,String>  data =  new ConcurrentHashMap<String, String> ();
		
		data.put("Rajan", "uma");
		data.put("Dinesh", "Sirisha");
		data.put("Madhu","Jal");
		data.put("Prasad","Bhargavi");
		
		for(ConcurrentHashMap.Entry d :data.entrySet())
		{
			System.out.println(d.getKey()+" "+d.getValue());
		}
		
		
		
		
		
	}

}
