package numbers;

import java.util.ArrayList;

public class PrimeKeMa 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		
		
		int  n =  10;
		int num ;
		int count = 0;
		
		System.out.println("prime");
		
		ArrayList<Integer> prime = new ArrayList<>();
		
		
		for(int i = 1; i <= n ; i++)
		{
		//	System.out.println(i);
			
			
			for( num = i; num>=1;num-- )
			{
				if(i%num==0)
				{
					count++;
					prime.add(i);
					//System.out.println(j);
				}
			}
			if (count == 2)
			{
				System.out.println("prime"+prime);
			}
			
		}
		
		
	}

}
