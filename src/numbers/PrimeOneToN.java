package numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeOneToN 
{

	public static void main(String[] args) 
	{
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int num  =  sc.nextInt();
		int evenCount = 0 ;
		int oddCount = 0;		
		
		sc.close();
		
		ArrayList<Integer>  prime =  new ArrayList<>();
		
		
		for(int i = 1; i <= num ; i ++)
		{
			if(i%2 == 0)
			{
				evenCount++;
				
	//			prime.add(i);
			}
			else if (i%3 ==0)
			{
				
				oddCount++;
				
			}
//			
			else 
			{
				prime.add(i);
			}
			
			
			
//		}
//		if(count == 2) 
//		{
//			System.out.println("This is a Prime number : "+num);
//		}
//		
//		else 
//		{
//			System.out.println("this is not a prime number"+num);
//		}
//		
		
		}
		System.out.println("*"+prime+"*");
	}

}
