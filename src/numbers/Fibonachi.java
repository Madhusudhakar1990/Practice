package numbers;

public class Fibonachi 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int a = 0 ;
		int b  = 1 ;
		
		int c = 0  ;
		
		
		for (int i = 1 ; i <= 9 ; i++)
		{
			
			 a = b ;
			 b = c ;
			 c = a+b ;
			 
			System.out.println(c);
			
			
			
		}
		
		
		
		
	}

}
