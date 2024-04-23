package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SyncArrayList 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		List<String> familyList = Collections.synchronizedList(new ArrayList<String>());
		
		familyList.add("Jalaja");
		familyList.add("Mivaan");
		familyList.add("Madhu");
		familyList.add("Jal");
		familyList.add("jawaan");
		familyList.add("Miwaan");
		
		synchronized (familyList)
		{
			Iterator<String> it = familyList.iterator();
			
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
		}
	}

}
