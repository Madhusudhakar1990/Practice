package numbers;

import java.util.ArrayList;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int num  =  19;
		
		int count = 0 ;
		
		
		ArrayList<Integer> prime =  new ArrayList<>();
	
		for(int j = 1; j <= num; j++)
	{
		
	
		for(int i = 1;i <= j ; i++)
		{
			if (j%i == 0)
			{
				
				count++;
				prime.add(i);
				
				
				
			}
			
		}
	}
		System.out.println(count);
		System.out.println(prime);	
				
	}

}
