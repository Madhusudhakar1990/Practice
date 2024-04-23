package experiment;

import java.util.Scanner;

public class PrimeTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		Scanner sc  =  new Scanner(System.in);
		System.out.println("Enter the number to fine the Prime number");
		
		int num  =  sc.nextInt();
		sc.close();
		
		int count = 0;
		
	for(int j = 1; j<=num; j++)	
	{	
		for(int i = 1 ; i <= j ;i++)
		{
			if (j%i == 0)
				
				count++;
			
		}
		
		 if (count == 2)
		System.out.println("Given number is Prime :"+ num );
		 else
		 {
			 System.out.println("this numbe is not prime :"+num);
		 }
		
		
	}	
		
		
		
	}

}
