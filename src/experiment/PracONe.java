package experiment;

public class PracONe 
{

	public int add(int a , int b)
	{
		int c ;
		
		c = a + b ;
		System.out.println("addition of two Number: "+ c);
		
		return c;
		
	}
	
	public int subtract(int a , int b)
	{
		int c ;
		
		c = a - b ;
		
		System.out.println("Subtrac of two Number: "+ c);
		return c;
		
	}
	
	public int multi(int a , int b)
	{
		int c ;
		
		c = a * b ;
		
		System.out.println("Multi of two Number: "+ c);
		return c;
		
	}
	public int div(int a , int b)
	{
		int c ;
		
		c = a / b ;
		System.out.println("Div of two Number: "+ c);
		return c;
		
	}
	
	
	
	public static void main(String[] args) 
	{

		PracONe  test = new PracONe();
		
		
		test.add(7, 6);
		test.subtract(8, 5);
		test.multi(8, 4);
		test.div(10, 5);
		
		
		
		
		
		
	}

}
