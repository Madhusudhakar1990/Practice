package experiment;

public class FizzBizz 
{

	public static void main(String[] args) 
	{

		int n  =  50;
		
		
		// if / 3 = fizz , if /5 , bizz  if/ 3 and 5 
		for(int i = 1;i <=n;i++)
		{
			if(i%3 == 0 && i%5==0)
			{
				System.out.println("both");
			}
			else if (i%3==0)
			{
				System.out.println("fizz");
			}
			
			else if(i%5 == 0)
			{
				System.out.println("Bizz");
			}
			
			else
			{
				System.out.println(i);
			}
		}
		
		
		
		
	}

}
