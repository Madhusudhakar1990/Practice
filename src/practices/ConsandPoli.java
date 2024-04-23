package practices;

public class ConsandPoli 
{

	public void details()
	{
		System.out.println(" name from details");
		
	}
	

	public void details(String name)
	{
		System.out.println(" name from details: "+name);
		
	}
	
	public void details(String name, int num)
	{
		System.out.println("Name :"+name+" EMP Id :"+num );
	}
	
	
	public ConsandPoli()
	
	{
		System.out.println("From constructor");
	}
	
public ConsandPoli(String name)
	
	{
		System.out.println("Name from Constructor :"+name);
	}
	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		ConsandPoli cp = new ConsandPoli();
		
		cp.details();
		cp.details("Madhu");
		cp.details("Sudhakar", 2343);
		
		ConsandPoli cp1 = new ConsandPoli("mivaan");
		
		
	}

}
