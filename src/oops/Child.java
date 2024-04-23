package oops;

public class Child extends Parents
{
String color  = "Brown";


public void blue()
{
	System.out.println("Blue is from child class ");
	
	System.out.println(super.blue());
}


//public void red()
//{
//	System.out.println("I am the red one from the child class");
//}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		Child cl  = new Child();
		
	//	cl.red();
		
		cl.blue();
		
		
//		Parents ps = new Parents();
//		
//		ps.red();
//		
	
			
			
		
		
		
		
	}

}
