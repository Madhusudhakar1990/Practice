package collection;

import java.util.HashMap;

public class FunWithMap 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		HashMap<Integer, String>  color = new HashMap<Integer, String>();
		
		color.put(1, "red");
		color.put(2, "pink");
		color.put(3, "orange");
		color.put(4, "pink");
		color.put(5, "black");
		color.put(6, "brown");
		color.put(7, "green");
		color.put(8, "blue");
		color.put(9, "gold");
		color.put(10, "violet");
		
		System.out.println(color.containsValue("pink"));
		System.out.println(color.containsKey(11));
		System.out.println(color.get(9));
		System.out.println(color.getOrDefault(10, null));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
