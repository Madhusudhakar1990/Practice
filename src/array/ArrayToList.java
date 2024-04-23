package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ArrayToList 
{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

		String[] subject =  {"Math","Scince","English","Civics","Computers","NoBooks"};
		
//		List<String> list =  new ArrayList<>();  
		
//		
//		for(String li : subject)  
		
//		{
//			list.add(li);
//						
//		}
//		
//		System.out.println(list);
		
//		TreeSet<String> sub =  new TreeSet<>();
//		
//		for(String ts : subject)
//			{
//				sub.add(ts);
//							
//			}
//		System.out.println(sub);
		
		List<String> list =  new ArrayList<>(Arrays.asList(subject));
		
		Collections.sort(list);
		
		System.out.println(list);
				
		System.out.println(list.get(list.size()-2));
		
//		list.get(list.size()-2);
		
		
		
		
		
		
		
		
		
	}

}
