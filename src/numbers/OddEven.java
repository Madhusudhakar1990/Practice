package numbers;

public class OddEven 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int[] num  = {1,2,3,4,5,6,7,8,9};
		
		int eCount = 0;
		int oCount = 0;
		
		
		
		for(int i = 0; i <= num.length;i++)
		{
			if (i %2==0)
			{
				System.out.println("Even number  : "+i);
				eCount++;
				
				
			}
			if (i %2!=0)
			{
				System.out.println(" Odd number  : "+i);
				oCount++;
				
				
			}
		}
		
		System.out.println("Number of even :"+eCount);
		System.out.println("Number of odd :"+oCount);
		
	}

}
