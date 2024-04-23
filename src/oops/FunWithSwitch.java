package oops;

import java.util.Scanner;

public class FunWithSwitch 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the day");
		System.out.println("Mon");
		System.out.println("Tue");
		System.out.println("Wed");
		System.out.println("Thu");
		System.out.println("Fri");
		System.out.println("Sun");
				
		String day =  sc.next();
		
		String time = sc.next();
					
		switch(day)
{
		case "Mon":			
		System.out.println("Monday");
		
		switch(time) 
		{
		
		case "am":
			
		System.out.println("am");
		break;
		
		
		case "pm":
		System.out.println("pm");
		break;
		
		
		}
		break;
		
		case "Tue":
		System.out.println("Tuesday");
		break;
		
		case "Wed":
		System.out.println("Wednesday");
		break;

		case "Thu":
		System.out.println("Thursday");
		break;
		
		case "Fri":
		System.out.println("Friday");
		break;
		
		case "Sat":
		System.out.println("Saturday");
		break;
			
		case "Sun":
		System.out.println("Sunday");
		break;



}
		
		
		
		
		sc.close();
		
		
		
	}

}
