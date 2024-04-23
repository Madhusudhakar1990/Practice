package numbers;

import java.util.Scanner;

public class FunWithNum 
{

	public void add(int a , int b )
	{
		int c  = a  + b ;
		
		System.out.println("Total is : "+c);
	}
	
	
	public static void main(String[] args) 
	{
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value A : ");
		
		int a  = sc.nextInt();
		
		System.out.println("Enter the value B : ");
		
		int b = sc.nextInt();
		
		
		FunWithNum fb =  new FunWithNum();
		
		fb.add(a, b);
		
		sc.close();

		
		
	}

}
