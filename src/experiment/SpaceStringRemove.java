package experiment;

import java.util.List;
import java.util.Scanner;

public class SpaceStringRemove 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		
		String text  = sc.next();
		
		String text1 = "";
		
		sc.close();
		
//		System.out.println("Test one"+text.split(" "));
		
		text1 = text.strip();
		
		System.out.println(text1);
		
		
		
		
		
	}

}
