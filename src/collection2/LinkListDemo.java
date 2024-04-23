package collection2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		LinkedList<String> name =  new LinkedList<>();
		
		
		name.add("one");
		name.add("two");
		name.add(2, "Three");
		name.addLast("last");
		name.addFirst("Zero");
		
				
		Iterator<String> it  = name.descendingIterator();
		
		System.out.println(name);
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}		
		
		
		
//		ArrayList<String>  naam =  new ArrayList<String>(name);
//		
//		System.out.println(naam);
	}

}
