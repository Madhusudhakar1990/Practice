package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class ArraysDemo 
{

	public static void main(String[] args) 
	{

		List<String> name =  new ArrayList<>();
		
		name.add("Madhu");
		name.add("Mivaan");
		name.add("Jala");
		name.add("Madhav");
		name.add("Vivaan");
		name.add("Jalaja");
		name.add("Madhav");
		name.add("Vivaan");
		name.add("Jalaja");
	//	Stream<String> na = name.stream();
		
//		System.out.println(name);
		
//		System.out.println("***************");
		
//		for(String n : name){System.out.println(n);	}
		
//		Collections.sort(name);
//				
//		System.out.println(name);
//		
//		System.out.println(	name.contains("Jala"));
//		
//		System.out.println(name.get(4));
//		
//		System.out.println(name.indexOf("Jalaja"));
//		
//		name.set(0, "Super");
//		
//		System.out.println(name);
		
//		System.out.println("***************");
		
		Iterator<String> it = name.iterator();
		
		Set<String> naam =  new HashSet<>();
		
		
		while (it.hasNext())
		{
//			System.out.println(it.next());
			naam.add(it.next());
			
		}
		System.out.println("******      Hash Set    *********");
		
		System.out.println(naam);
		
		
		
		
		
		
	}

}
