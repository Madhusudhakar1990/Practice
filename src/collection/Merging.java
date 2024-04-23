package collection;

import java.util.HashMap;
import java.util.Map;

public class Merging 
{

	public static void main(String[] args) 
	{
	
		int[] id = {1,2,3};
		String[] emp = {"Madhu","Sudhakar","Yaragudi"};
	
		
		Map<Integer,String> data = new HashMap<>();
		
		data.put(id[0], emp[0]);
		data.put(id[1], emp[1]);
		data.put(id[2], emp[2]);
		
		System.out.println(data);
		
		
		
		
		
	}

}
