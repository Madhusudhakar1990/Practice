package numbers;

public class FunWithNumbers 
{

int a  = 2 ;
int b  = 3;

public void add()
{
	
	int c =  a + b ;
	
	System.out.println("adding of two numbers is :"+c);
}


public void sub(int e, int f)
{
 int c = e - f;
	
	System.out.println("sub of two number "+c);
}
		
	public static void main(String[] args) 
	{
	
		
		FunWithNumbers fk =  new FunWithNumbers();
		
		fk.add();
		
		fk.sub(3, 6);
		
		
		
		
	}

}
