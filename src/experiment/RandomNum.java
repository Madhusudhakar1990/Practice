package experiment;

import java.util.Random;

public class RandomNum 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

//		int[] num = {3,5,2,6,4,10};
		
		Random rn  = new Random();
		int randomInt	= rn.nextInt(50);
		
		
		System.out.println(randomInt);
		Thread.sleep(1000);
		
		
		
	}

}
