package practices;

import java.util.Scanner;

public class Switch 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("chose fromm below case");
		System.out.println("Case :1");
		System.out.println("Case :2");
		
		System.out.println("Enter the case number as digit");


		int option = sc.nextInt();
		
		
		switch(option)
			{
				case 1:
						
				System.out.println("Case one");
				break;
				
				case 2:
					
				System.out.println(" Case two");
				break;
				
				case 3:
					
				System.out.println("Case three");
				break;
				
				case 4:
						
				System.out.println(" Case four");
				break;
		
		
			}
		sc.close();
		
	}

}
