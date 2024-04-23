package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Numbers 
{

	public static void main(String[] args) 
	{
		
		int[] numbers = {2,3,4,2,3,5,6,0,9,8,1,7,3,5,2,4,7,2,6,9,7,1,2,4,0,8,5};
		
		Set<Integer> num = new LinkedHashSet<Integer>();
		
//		**************loop ke maa ke ankh********
		for(int i = 0; i <=numbers.length; i++) 
		{
			num.add(i);
		//	System.out.println(numbers[i]);
		}
//		**************loop ke maa ke ankh********
		
	//	LinkedHashSet<Integer> num =  new LinkedHashSet<Integer>();
		
		
	//	System.out.println(num);
		
		
	//	TreeSet<Integer>  num =   TreeSet(numbers);
		
		
//		LinkedHashSet<Integer> num = new LinkedHashSet<Integer>();
		
		
		System.out.println(num);
		System.out.println(num.size());
		
		List<Integer> list = new ArrayList<>(num);
		
		
		
		System.out.println(list.indexOf(list.size()-1));
		
	//	num.size();
		
		
	}

}
