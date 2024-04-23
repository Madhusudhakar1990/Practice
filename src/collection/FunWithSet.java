
package collection;

import java.util.HashSet;
import java.util.Iterator;

public class FunWithSet 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		HashSet<String> tools =  new HashSet<>();
		
		tools.add("Java");
		tools.add(null);
		tools.add("python");
		tools.add("C#");
		tools.add(null);
		tools.add("JavaScript");
		
		System.out.println(tools);
//		
//		Iterator<String> it = (Iterator<String>)tools.spliterator();
//		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//		
		
		
		
	}

}
