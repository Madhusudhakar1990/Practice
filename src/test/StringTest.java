package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringTest {

	public static void main(String[] args)
	{


		String[] subject =  {"Math","Scince","English","Civics","Computers","NoBooks"};
		
		
//		List<String>  listone = new ArrayList<>();
//		for(int i =0 ; i <= subject.length-1;i++)
//		{
//		//	System.out.println(subject[i]);	
//			listone.add(subject[i]);
//			
//			
//			
//		}
//		
//		System.out.println("list : "+listone);
//		
		
		
		List<String>  list = new ArrayList<>();
		
		for(String s  : subject)
		{
			list.add(s);
		}
		System.out.println("list : "+list);
		
		Collections.sort(list);
		System.out.println("list : "+list);
		
		System.out.println(list.get(list.size()-2));
		
		
		
	}

}
