package numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumArray {

	public static void main(String[] args) 
	{

		int[] num = {3,2,5,65,8,9,4,6,21,3,56,78,34,9};
		
	List<Integer>li = new ArrayList<>();
	
	for(int in : num)
	{
		li.add(in);
		
	}
	// System.out.println(li);
		
	Collections.sort(li);
	
	System.out.println(li);
	
	int si = li.size();
	
	System.out.println(si);
	
	System.out.println(li.get(li.size()-2));
	
	
		
	}

}
