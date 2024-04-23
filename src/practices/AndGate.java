package practices;

public class AndGate 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		
		int[] num = {2,4,3,1,5,7,1,9,7,3,8,0,6,};
		
	for(int n : num)
	{
		if (n%2 == 0 && n%3 == 0)
		{
			System.out.println("Magical number :"+n);
		}
	}
		
		
	}

}
