package collection;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapPractice 
{

	public static void main(String[] args) 
	{
	
		HashMap<Integer, String>  data1 =  new HashMap<Integer, String>();
		
		data1.put(1, "Apple");
		data1.put(4, "Dog");
		data1.put(3, "Cat");
		data1.put(2, "Ball");
		
		System.out.println(data1);

		HashMap<Integer, String>  data2 =  new HashMap<Integer, String>();
		
		data2.put(1, "Apple");
		data2.put(2, "Ball");
		data2.put(3, "Cat");
		data2.put(4, "Dog");
				
		System.out.println(data2);
				
		HashMap<Integer, String>  data3 =  new HashMap<Integer, String>();
		
		data3.put(1, "Apple");
		data3.put(2, "Ball");
		data3.put(3, "Cat");
		data3.put(4, "Dog");
		data3.put(5, "Ell");
				
		System.out.println(data3);
		
		System.out.println("**********whole map campair***********");
		
		
		System.out.println(data1.equals(data3));
		System.out.println(data1.equals(data2));
		
		System.out.println("*******key campair************");
		
		System.out.println(data1.keySet().equals(data2.keySet()));
		
		System.out.println(data1.keySet().equals(data3.keySet()));
		
		HashSet<Integer>  has =  new HashSet<Integer>(data1.keySet());
		
		System.out.println("*******HashSet no duplicate allowed************");
		
	//	System.out.println(has);
		
	//	HashSet<Integer>  hash =  new HashSet<Integer>(data3.keySet());
		
	//	System.out.println(hash);
		
		has.addAll(data3.keySet());
		
		has.removeAll(data1.keySet());
		
		System.out.println(has);
		
	}

}
