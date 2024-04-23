package practices;

public class Prime 
{
	
	public static void main(String[] arg) 
	{
		
		
		int n = 8;
		
		int count = 0;
		
	//	List<Integer> prime = new ArrayList<>();
		
		for(int i =1; i <= n;i++)
		{
			if(n%i == 0 )
			{
				count++;
	//			prime.add(i);
				
			}
			
			
			
		}
		if(count == 2)
		System.out.println("prime number "+n);
		
		else
			
			System.out.println("NOt a Prime number "+n);
	//	System.out.println(prime);
		
		
		
		
		
	}
}
