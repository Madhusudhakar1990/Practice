package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		ArrayList<String> name  = new ArrayList<String>();
		
		name.add("Madhu");
		name.add("super");
		name.add("MIvaan");
		name.add("Jal");
		
		Iterator<String> it  =  name.iterator();
		
	
		
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Collections.sort(name);
		

		System.out.println("___________________________");
		
		
		System.out.println(name);
		
		
		name.add(0, "first");
		name.add(4, "last");
		
		System.out.println("___________________________");
		
		
		System.out.println(name);	
		Collections.sort(name);
		

		System.out.println("___________________________");
		
				
		
		for(String n : name) 
		{
		
			System.out.println(n);
		
		}
		
		
		
		
		
	}

}
