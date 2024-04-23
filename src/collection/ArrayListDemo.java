package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Stream;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> name =  new ArrayList<String>();
		
		name.add("Madhu");
		
		name.add("Mivaan");
		
		name.add("Jalaja");
		
		name.add("John");
		
		name.add("Wick");
		
		name.add("Tom");
		
			System.out.println("******************");
		
//		
//		for(int i = 0; i <= name.size()-1;i++)
//		{
//			System.out.println(name.get(i));
//		}
//		
		
		
//		name.stream().forEach(na -> System.out.println(na));  // 
		
		
		
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		number.add(23);
		number.add(24);
		number.add(45);
		number.add(22);
		number.add(44);
		number.add(65);
		number.add(23);
		number.add(22);
		number.add(42);
		number.add(82);
		number.add(45);
		number.add(67);
		
		
		Stream<Integer> nums = number.stream();
		
//		long count = nums.count();
		
		Stream<Integer> list=nums.unordered();
		
//		Stream<Integer> list = nums.sorted();
		
		list.forEach(l-> System.out.println(l));
		
		
		
		
		
//		System.out.println("******************");
//		
//		
//		number.forEach(n->System.out.println(n));
//		
//		Collections.sort(number);
//		
//		System.out.println("******************");
//		
//		number.forEach(m->System.out.println(m));
		
	//	number.removeIf(num -> num%2 ==0);
		
	//	number.removeIf(num -> num%2 !=0);
		
	//	System.out.println(number);
		
		
		
		
//		System.out.println(number.size());	
//		System.out.println(number.size()-1);	
//		System.out.println(number.get(4));
//		
//		System.out.println(number.lastIndexOf(22));
			
		
//		Iterator<Integer> it = number.iterator();
		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//		
		
		
		
		
	//	System.out.println(number);
//		
//		for(int num : number)
//		{
//			System.out.println(num);
//		}
//		
		
//		
//		ArrayList<Object>  obj =  new ArrayList<Object>();
//		
//		obj.add(number);
//		obj.add(name);
//		obj.add("test");		
//		obj.add(23);
//		
//		
	//	System.out.println(obj);
		
//		
//		obj.add(2, 333);
		System.out.println("******************");
//		
//		System.out.println(obj);
//		
//		System.out.println(obj.contains(23));
//		System.out.println(obj.equals(name));
//		System.out.println(obj.equals(obj));
//		
//		System.out.println("******************");
//		
		
	}

}
