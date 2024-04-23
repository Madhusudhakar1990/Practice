package string;

import java.util.Scanner;

public class FunWithString 
{

	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name to revesr");
		
		String name = sc.next();
			
	//	System.out.println("my name "+name);
	
	//	System.out.println(name.charAt(0));
		
		for(int i = name.length()-1 ; i >= 0 ;i--)
		{
			System.out.print(name.charAt(i));
		}
		
		sc.close();
		
		
		
		
		
		
		
	}

}
