package array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Names 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	String[] names = {"Madhu","Sudhakar","Mivaan","Jalaja","suma","Sudhakar","Karthik","Jalaja","Madhu","Reshma","Mivaan","Jalaja"};
		
//		System.out.println(names.length);
		
//		Reverse the array 
		
//		for(int i = names.length-1; i >= 0 ; i--)
//		{
//			System.out.println(names[i]);
//		}
		
		ArrayList<String> naam = new ArrayList<String>(Arrays.asList(names));
		
		LinkedHashSet<String>  naamnodup =  new LinkedHashSet<String>(naam);
		
//		****  sorting  ******
//		System.out.println("* "+naam+" *");
//		Collections.sort(naam);
//		
//		System.out.println(naam);
//		****  sorting  ******
		
		System.out.println(naamnodup);
	
		System.out.println("*********");
		
		ArrayList<String>  na =  new ArrayList<String>(naamnodup);
		
		
		Collections.sort(na);
		
		System.out.println(na);
		System.out.println("*********");
			
		System.out.println(na.get(na.size()-1));
		System.out.println("*********");
		
	}

}
