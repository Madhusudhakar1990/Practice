package collection2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapDemoFeb 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Integer and then String");
		
		
		
		String data = sc.next();
		sc.close();
		
//		System.out.println(data);
		
		String[] da = data.split(" ");
		
		
		Map<String,String> daat = new HashMap<>();
		
		daat.put(da[0], da[1]);
		
		System.out.println("***********************");
		System.out.println(daat);
		
//		Set<Entry<String,String>> dis = daat.entrySet();
//		
//		Iterator<Entry<String,String>> it = dis.iterator();
//		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//	
		
		
		
		
		
		
	}

}
