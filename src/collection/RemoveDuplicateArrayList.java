package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateArrayList 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ArrayList<String> proLan = new ArrayList<String>();
		
		proLan.add("Java");
		proLan.add("c++");
		proLan.add("Python");
		proLan.add("Swift");
		proLan.add("c#");
		proLan.add("Java");
		proLan.add("Java");
		proLan.add("c++");
		proLan.add("Python");
		proLan.add("Swift");
		proLan.add("c#");
		proLan.add("Java");

		System.out.println(proLan);

		// linkedHashSet do not accept duplicate 
		LinkedHashSet<String>  programlist = new LinkedHashSet<String>(proLan);
		
		System.out.println("This list is from Linked hash set "+programlist);

		ArrayList<String> newProgList =  new ArrayList<String>(programlist);
		
		System.out.println("This lis is from arraylist "+ newProgList);

		// Stream  		
		
		List<String> prolang = proLan.stream().distinct().collect(Collectors.toList());
		
		System.out.println("***"+prolang+"***");
		
	}

}
