package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IterviewTestTwooo 
{

	public static void main(String[] args) 
	{

			int[] data ={3,0,4,0,6,2,1,0,0,5};// Output - {3,4,6,2,1,5,0,0,0,0}
			
				
			List<Integer> list = new ArrayList<>();
			
					
			int l = data.length;
			
			
			
			for(Integer n : data)
			{
			//	list.add(n);
				
				if(n == 0); // 
				{
					list.add(l, n);
				}
				
				
			}
		
//		System.out.println(list);
			
			
			Collections.sort(list);
			
			System.out.println(list);
			
	//		Object[] num = list.toArray();
			
			
			
			
		
	}

}
